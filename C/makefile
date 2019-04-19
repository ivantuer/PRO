.PHONY: clean

clean:
	rm -rf Lab2.out *.o

Lab2: input.o output.o changeMinMax.o main.o 
	gcc input.o output.o changeMinMax.o main.o -o Lab2.out
input.o: input.c 
	gcc -c input.c -o input.o
output.o: output.c
	gcc -c output.c -o output.o
changeMinMax.o: changeMinMax.c
	gcc -c changeMinMax.c -o changeMinMax.o
main.o: main.c
	gcc -c main.c -o main.o


