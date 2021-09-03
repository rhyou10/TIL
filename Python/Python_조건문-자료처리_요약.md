# Python 조건문 - 자료처리

## 조건문 간편화

```python
a=int(input())
if a%15==0:
  print('fizz buzz')
elif a%5==0:
  print('buzz')
elif a%3==0: 
  print('fizz')

#위코드 아래코드 결과 같다

print('fizz'*(a%3==0) +'buzz'*(a%5==0) or a)
```



## 딕셔너리 자료처리

### 삽입, 수정, 삭제, 빈딕셔너리로 만들기

```python
x = {'a': 10, 'b': 20, 'c': 30, 'd': 40}
#삽입
y=x.setdefault('e',100) # y값에 100이 들어간다
x['f'] = 200

#수정
x.update(a=90)
x['a'] = 90

#삭제
y = x.pop('a') # y값 10
del x['a']

#빈딕셔너리로 만들기
x.clead()
```

### 딕셔너리 연산

```python
x = {'a': 10, 'b': 20, 'c': 30, 'd': 40}
x2 = {key: value*value for key, value in x.items()}
```

### 딕셔너리안에 딕셔너리 생성가능하다

```python
book ={
    '해리포터':{
        '저자' : 'jk롤링',
        '판매수' : 10000 
    },
    '어린왕자':{
        '저자' : '생땍이',
        '판매수' : 20000
    }
}
```



## 리스트 조작

### append, extend

- 끝에 붙이는 방식
- append는 리스트붙이면 리스트안에 리스트 형식
- extend는 리스트 붙이면 리스트 풀어서 리스트 안으로



### 리스트 값 삭제

```python
a=[0,10,20,30,40,50,60,10]
del a[3]
a.remove(10)
```



### 리스트 사이에 값 넣기

```python
a.insert(3,10)
a[3:3] = [33] #꼭 리스트 형태로 해야한다 
```



### 복사 주의

```python
a[0,0,0,0,0]
b=a  #a b 값 서로 바뀌어도 계속 같아진다

b=a.copy() # 값만 복사한다

```



### sort

```python
a.sort() #a 자체가 정렬 된다
sorted(a) # a는 그대로고 정렬된 a 반환

#인자로 reverse=True 하면 오름차순 가능
```



## 문자열 조작

### replace()

``` python
a ='hello hello world'
a = a.replace('hello', 'bye') #hello를 전부 bye 로 바꾼다
> 'bye bye world'
```

### split()



### join()

- 나누어진 문자열 연결

```python
x = ['a', 'b', 'c']
' '.join(x)
>> 'a b c'
#split 와 반대

x = ['a', 'b', 'c']
'>'.join(x)
>> 'a>b>c'
```



### upper, lower

- 대문자 소문자 구별

###  just(좌우 공백 정렬)

- 정렬 rjust, ljust, center 등 있다.

```python
'python'rjust(10)
'          python'
```



### strip

- 특정 문자열 지우기

```python
p='\t\t pyhton \n\n'
p = p.strip('\t\n ')
```



### find

- find, rfind 가 있다 
- 찾는 문자열의 첫번째 발견된 곳의 index 반환
- 없을시 0 반환



### count

- 찾는 문자열의 개수만환

```python
f='apple pineapple'
f.count(ap)
>> 2
```





## 서식지정자 

- 문자열 서식지정자

```python
`내 이름은 %s` %'태혁'
'%10s' %'python' #10글자를 가져온다는 뜻
```

- 실수의 경우 %10.2f  정수자리 10개까지, 소수점 2번째 자릭까지



### 람다함수

- 인수 넣기

``` python
(lambda x:x+10)(10)
(lambda x, y :x+y+10)(10, 20)
```



- map 활용 리스트 넣기

```python
list(map(lambda x : x*x if x==2 else x, a))
# else 꼭 필요하고 map을 활용하여 리스트 넣었다
```

```python
a=[1,2,3,4,5]
b=[6,7,8,9,10]
list(map(lambda x, y : x*y, a,b))
#여러개의 객체넣기
```



