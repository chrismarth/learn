package org.marth.learn.mapreduce;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;

/**
 * Created by racerx on 10/29/15.
 */
public class MaxTemperatureMapper extends Mapper<LongWritable, Text, Text, IntWritable> {

    @Override
    public void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
        String line = value.toString();
        String year = line.substring(15, 19);
        String temp = line.substring(87, 92);
        if (!missing(temp)) {
            int airTemperature = Integer.parseInt(temp);
            context.write(new Text(year), new IntWritable(airTemperature));
        }
    }

    private boolean missing(String temp) {
        return temp.equals("+9999");
    }
}
