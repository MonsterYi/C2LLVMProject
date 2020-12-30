#include <stdio.h>

char OPTR[1000];
double OPND[1000];

int precede(char a, char b) {
	if (a == '+' && b == '+') {
		return 1;
	}
	if (a == '+' && b == '-') {
		return 1;
	}
	if (a == '+' && b == '*') {
		return 2;
	}
	if (a == '+' && b == '/') {
		return 2;
	}
	if (a == '+' && b == '(') {
		return 2;
	}
	if (a == '+' && b == ')') {
		return 1;
	}
	if (a == '+' && b == '$') {
		return 1;
	}

	if (a == '-' && b == '+') {
		return 1;
	}
	if (a == '-' && b == '-') {
		return 1;
	}
	if (a == '-' && b == '*') {
		return 2;
	}
	if (a == '-' && b == '/') {
		return 2;
	}
	if (a == '-' && b == '(') {
		return 2;
	}
	if (a == '-' && b == ')') {
		return 1;
	}
	if (a == '-' && b == '$') {
		return 1;
	}

	if (a == '*' && b == '+') {
		return 1;
	}
	if (a == '*' && b == '-') {
		return 1;
	}
	if (a == '*' && b == '*') {
		return 1;
	}
	if (a == '*' && b == '/') {
		return 1;
	}
	if (a == '*' && b == '(') {
		return 2;
	}
	if (a == '*' && b == ')') {
		return 1;
	}
	if (a == '*' && b == '$') {
		return 1;
	}

	if (a == '/' && b == '+') {
		return 1;
	}
	if (a == '/' && b == '-') {
		return 1;
	}
	if (a == '/' && b == '*') {
		return 1;
	}
	if (a == '/' && b == '/') {
		return 1;
	}
	if (a == '/' && b == '(') {
		return 2;
	}
	if (a == '/' && b == ')') {
		return 1;
	}
	if (a == '/' && b == '$') {
		return 1;
	}

	if (a == '(' && b == '+') {
		return 2;
	}
	if (a == '(' && b == '-') {
		return 2;
	}
	if (a == '(' && b == '*') {
		return 2;
	}
	if (a == '(' && b == '/') {
		return 2;
	}
	if (a == '(' && b == '(') {
		return 2;
	}
	if (a == '(' && b == ')') {
		return 0;
	}
	if (a == '(' && b == '$') {
		return 3;
	}

	if (a == ')' && b == '+') {
		return 1;
	}
	if (a == ')' && b == '-') {
		return 1;
	}
	if (a == ')' && b == '*') {
		return 1;
	}
	if (a == ')' && b == '/') {
		return 1;
	}
	if (a == ')' && b == '(') {
		return 3;
	}
	if (a == ')' && b == ')') {
		return 1;
	}
	if (a == ')' && b == '$') {
		return 1;
	}

	if (a == '$' && b == '+') {
		return 2;
	}
	if (a == '$' && b == '-') {
		return 2;
	}
	if (a == '$' && b == '*') {
		return 2;
	}
	if (a == '$' && b == '/') {
		return 2;
	}
	if (a == '$' && b == '(') {
		return 2;
	}
	if (a == '$' && b == ')') {
		return 3;
	}
	if (a == '$' && b == '$') {
		return 0;
	}

	return 3;
}

int isOp(char a) {
	if (a == '+' || a == '-' || a == '/' || a == '*' || a == '(' || a == ')' || a == '$') {
		return 1;
	}
	return 0;
}

double calc(double a, char op, double b) {
	double res = 0.0;
	if (op == '+') {
		res = a + b;
	}
	else if (op == '-') {
		res = a - b;
	}
	else if (op == '*') {
		res = a * b;
	}
	else if (op == '/') {
		res = a / b;
	}
	return res;
}

int main() {
	printf("Please input expression:");
	char c;
	char end = '$';
	int status = 0;
	char theta;
	double a, b = 0.0;
	double ans = 0.0;
	int optrTop = -1;
	int opndTop = -1;
	OPTR[optrTop+1] = '$';
	optrTop = optrTop + 1;
	scanf("%c",&c);
	while (c != end || OPTR[optrTop] != end) {
		if (!isOp(c)) {
			c = c - '0';
			OPND[opndTop + 1] = c;
			opndTop = opndTop + 1;
			scanf("%c",&c);
		}
		else {
			status = precede(OPTR[optrTop],c);
			if (status == 2) {
				OPTR[optrTop + 1] = c;
				optrTop = optrTop + 1;
				scanf("%c",&c);
			}
			else if (status == 0) {
				optrTop = optrTop - 1;
				scanf("%c",&c);
			}
			else if (status == 1) {
				theta = OPTR[optrTop];
				optrTop = optrTop - 1;
				b = OPND[opndTop];
				opndTop = opndTop - 1;
				a = OPND[opndTop];
				opndTop = opndTop - 1;
				ans = calc(a, theta, b);
				OPND[opndTop + 1] = ans;
				opndTop = opndTop + 1;
			}
		}
	}
	printf("%.2f", OPND[opndTop]);
	return 0;
}
