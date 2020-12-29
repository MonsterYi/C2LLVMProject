import sys
from Generator.Generator import generate

class CodeGenerator:
    def __init__(self):
        pass

    def generate(self, c_filename: str):
        print("Input filename %s ..." % c_filename)


if __name__ == "__main__":
    if len(sys.argv) < 2:
        exit("Input filename(.c) is needed!")
    filename = sys.argv[1]
    code_generator = CodeGenerator()
    code_generator.generate(filename)
