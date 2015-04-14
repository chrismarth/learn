import survey
import numpy

table = survey.Pregnancies()
table.ReadRecords()

print 'Number of pregnancies:', len(table.records)


liveBirths = [record for record in table.records if record.outcome == 1]
print 'Number of live births:', len(liveBirths)

firstBabies = [record for record in liveBirths if record.birthord == 1]
print 'Number of first babies:', len(firstBabies)
firstBabiesPregLength = numpy.asarray([record.prglength for record in firstBabies])
print 'Avg pregnancy length for first babies', numpy.average(firstBabiesPregLength)

#notFirstBabies = [record for record in liveBirths if record.birthord != 1]
notFirstBabies = list(set(liveBirths) - set(firstBabies))
print 'Number of not first babies:', len(notFirstBabies)
notFirstBabiesPregLength = numpy.asarray([record.prglength for record in notFirstBabies])
print 'Avg pregnancy length for first babies', numpy.average(notFirstBabiesPregLength)
