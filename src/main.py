import sys
from Generator.Generator import generate

if __name__ == "__main__":
    if len(sys.argv) < 2:
        exit("Input filename(.c) is needed!")
    filename = sys.argv[1]
    generate(filename, filename.split(".")[0]+".ll")
