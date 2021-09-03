# Python 개인요약

## del

```python
del x(변수 삭제)
```

- 변수 삭제, 리스트 등 다야한 자료형에서 사용된다

## input()

```python
input()
input().split()
input('어떤것을 입력하실건가요')
```

- 입력을 받을수 있다
- split() 를 사용하여 문자열 나눌수있다(default는 공백)
- 기본적으로 문자열 형태로 받는다 (숫자도, 문자도)
- () 내부에 '`문자열`' 을 넣어 입력을 도울 수 있다. 

## split()

- 문자열을 나누어서 리턴
- input().split() 형태로 많이 사용된다

```python
a='a,b,c'
a.split(',')
> ['a', 'b', 'c']
```

- () 내부 인자로 문자를 나누는 기준을 넣어 분리할 수 있다.

## map()

- 전체 자료형을 변경 가능

```python
a = map(int, input().split())
```

- 형식으로 많이 쓰인다
- 리스트에도 쓰인다 추후 추가예정

## print()

- 기본적인 출력함수

```python
a = '123'
b = 3
print(a,b)
print('hi')
print(3)
print('123\n456')
> 123
> 456
```

```python
print(1,2,3,end=' ') #출력 한 후 마지막에 엔터
print(1,2,3,sep='\n') #출력 인자값을 엔터로 나눈다
print(1,2,3)
> 1 2 3 1
> 2
> 3
> 1 2 3
```

- (,`argument`'=' ') 다양한 `argument` 를 통해 입력 값 설정 가능
- 추후 갱신예정

## bool() 과 논리 연산자

```python
3 < a < 10 #python 만가능
and, or, not
bool(0), bool(qwdas) > (False, True)
```

### Short-circuit evaluation

```python
1 or 'python'    > 1
0 or 'python'    > 0
0 and 'phython'  > 0
1 and 'ph'  	 > 'ph'
```



## list()

- 여러가지 자료형의 변수를 한번에 저장

```python
a = list('abc') #전부 나누어서 들어간다
a = ['a', 'b' 'c'] # > 이방식이 보편적
person = ["james", 19, 175.4, True,['a','b','c',12]] # 여러개의 자료형 가능
#빈 리스트
a = []
a = list()
a, b, c = list('abc') = [1, 3, 4] # unpacking
```



## range()

```python
range(3, 5, 1) > 3, 4
list(range(1, 10, 1))
a = range(10, 1 , -1)
b=list(b)
```

- range(`시작값`, `끝값`, `증가분`) 



## tuple()

- 변경 불가능, 만들어 진 후 read only

```python
a = () # 빈 tuple()
a = tuple() #빈튜플  튜플 굳이 빈공간으로 두지 않는다

b =(38) -> tuple x
b = (,38) -> tuple o

c = [1, 2, 3, 4]
b = tuple(c) #리스트 <--> 튜플 가능
c = list(b)

a, b, c = tuple('abc') = (1, 2, 3) # --> 나누어 들어간다
a = 3, 4, 5 #--> 튜플형식
```



## 시퀀스 자료형(삽입, Slicing, indexing, 계산 등)

- `리스트` `튜플` `range()` `문자열` 등이 있다

- for 문에 사용가능
- 시퀀스 끼리의 연결
- 시퀀스의 연산

```python
[2,4,6]+[1,3,5] > [2, 4, 6, 1, 3, 5]
[1,2,3] * 3 > [1, 2, 3, 1, 2, 3, 1, 2, 3] #튜플도 된다 range()는 연산 x
```

### len()

- 요소의 개수

```python
len(range(10)) > 10
```

### sclicing

- 모든 시퀀스에 사용가능
- a[`시작` : `끝` : `증가분`] 슬라이싱 가능

```python
a=list([range(10)])

a[1:10:2] #> 슬라이싱
del a[1:10:2] # >삭제 

list(range(10)[slice(4, 7, 2)]) > range(4, 7, 2)

# 삽입 기억하자
c=list(range(10))
c[2]=[10,20,30]
c > [0, 1, [10, 20, 30], 3, 4, 5, 6, 7, 8, 9]

d=list(range(10))
d[2:2]=[10,20,30]
d > [0, 1, 10, 20, 30, 2, 3, 4, 5, 6, 7, 8, 9]
```



### 시퀀스 자료형 sum, min 등

```python
a= list(range(5))
sum = sum(a)
sum
>> 10
## sum, min, max 등 사용가능
```



## Fromatted String

- 문자열 내에 변수값을 넣을때

```python
a =10
f`{a} = 10이다`
> 10 = 10이다
```



## 딕셔너리

- 기본적으로 `키`와 `값`으로 구성된다(키만넣으면 set 형식)

```python
dic = {} #빅 딕셔너리
dic = {'a':100, 'b': 200}

#키값으로 접근
dic['a']
>> 100

# max, min, sum 사용가능
max(dic)
>> b
sum(dic.values())
>> 300
```

### **zip**

```python
a = ['a', 'b', 'c', 'd', 'e']
b = [1, 2, 3, 4, 5]
zip(a, b)
dic(zip(a, b)) ## 딕셔너리 형태로 합쳐준다
```



### in

```python
'a' in dic
>> True
#in 잘써야된다
```

