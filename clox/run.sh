set -e
gcc *.c -o main -Wall -Wpedantic -Werror
./main $1
