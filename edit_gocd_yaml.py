import sys

team = sys.argv[1]
service = sys.argv[2]
repoName = sys.argv[3]

fin = open("pipeline_format.txt", "rt")
data = fin.read()
data = data.replace('<data.team>', team)
data = data.replace('<data.service>', service)
data = data.replace('<data.repoName>', repoName)
fin.close()
fin = open("pipeline_format.txt", "wt")
fin.write(data)
fin.close()
