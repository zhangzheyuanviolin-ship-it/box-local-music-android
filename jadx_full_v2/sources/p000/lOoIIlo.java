            package p000;
            
            public abstract class lOoIIlo {
                public static final int I00000oIO(int i, int i2) {
/* 2 */             return (i >> i2) & 31;
                }

                public static final Object[] I00000oOI(Object[] objArr, int i, Object obj, Object obj2) {
/* 4 */             Object[] objArr2 = new Object[objArr.length + 2];
/* 8 */             I1IoiO1l.I000oI1ioi(objArr, 0, objArr2, i, 6);
/* 14 */            I1IoiO1l.I000iOII(objArr, i + 2, objArr2, i, objArr.length);
/* 17 */            objArr2[i] = obj;
/* 21 */            objArr2[i + 1] = obj2;
/* 204 */           return objArr2;
                }

                public static final Object[] I0000Il00O(int i, Object[] objArr) {
/* 4 */             Object[] objArr2 = new Object[objArr.length - 2];
/* 8 */             I1IoiO1l.I000oI1ioi(objArr, 0, objArr2, i, 6);
/* 14 */            I1IoiO1l.I000iOII(objArr, i, objArr2, i + 2, objArr.length);
/* 37 */            return objArr2;
                }

                public static final Object[] I0000O(int i, Object[] objArr) {
/* 4 */             Object[] objArr2 = new Object[objArr.length - 1];
/* 8 */             I1IoiO1l.I000oI1ioi(objArr, 0, objArr2, i, 6);
/* 14 */            I1IoiO1l.I000iOII(objArr, i, objArr2, i + 1, objArr.length);
/* 37 */            return objArr2;
                }
            }
