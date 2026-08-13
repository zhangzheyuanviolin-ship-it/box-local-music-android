            package p000;

            import java.lang.reflect.Member;
            import java.lang.reflect.Method;
            import java.lang.reflect.Type;
            import java.util.List;
            
            public final class OoloIllIlii0 implements IIiOlII {
                public IIiOlII I00000oIO;
                public Member I00000oOI;
                public Oo1ol1ll I0000Il00O;
                public IooO11l[] I0000O;
                public boolean I0000oI00;

                @Override
                public final List I00000oIO() {
/* 3 */             return this.I00000oIO.I00000oIO();
                }

                @Override
                public final Member I00000oOI() {
/* 1 */             return this.I00000oOI;
                }

                @Override
                public final boolean I0000Il00O() {
/* 3 */             return this.I00000oIO instanceof IIiii0lI;
                }

                @Override
                public final Object I0000O(Object[] objArr) {
                    Object objInvoke;
                    Object objInvoke2;
/* 1 */             Oo1ol1ll oo1ol1ll = this.I0000Il00O;
/* 5 */             IooO11l iooO11l = (IooO11l) oo1ol1ll.I00iiI;
/* 9 */             List[] listArr = (List[]) oo1ol1ll.I00iiO;
/* 13 */            Method method = (Method) oo1ol1ll.I00iio;
/* 15 */            boolean zIsEmpty = iooO11l.isEmpty();
/* 19 */            int i = iooO11l.I00iiI;
/* 21 */            int i2 = iooO11l.I00iOIl;
/* 24 */            if (!zIsEmpty) {
/* 31 */                if (this.I0000oI00) {
/* 36 */                    O101lO1 o101lO1 = new O101lO1(objArr.length);
/* 40 */                    for (int i3 = 0; i3 < i2; i3++) {
/* 44 */                        o101lO1.add(objArr[i3]);
                            }
/* 50 */                    if (i2 <= i) {
                                while (true) {
/* 52 */                            List<Method> list = listArr[i2];
/* 54 */                            Object obj = objArr[i2];
/* 56 */                            if (list != null) {
/* 68 */                                for (Method method2 : list) {
/* 91 */                                    o101lO1.add(obj != null ? method2.invoke(obj, null) : Oolli0oi0.I0000Il00O(method2.getReturnType()));
                                        }
                                    } else {
/* 95 */                                o101lO1.add(obj);
                                    }
/* 98 */                            if (i2 == i) {
                                        break;
                                    }
/* 100 */                           i2++;
                                }
                            }
/* 103 */                   int i4 = i + 1;
                            int length = objArr.length - 1;
/* 108 */                   if (i4 <= length) {
                                while (true) {
/* 112 */                           o101lO1.add(objArr[i4]);
/* 115 */                           if (i4 == length) {
                                        break;
                                    }
/* 117 */                           i4++;
                                }
                            }
/* 126 */                   objArr = IOOi1I.I0000Il00O(o101lO1).toArray(new Object[0]);
                        } else {
/* 131 */                   int length2 = objArr.length;
/* 132 */                   Object[] objArr2 = new Object[length2];
/* 134 */                   for (int i5 = 0; i5 < length2; i5++) {
/* 136 */                       if (i5 > i || i2 > i5) {
/* 173 */                           objInvoke2 = objArr[i5];
                                } else {
/* 140 */                           List list2 = listArr[i5];
/* 151 */                           Method method3 = list2 != null ? (Method) IOOi0Ool1i.I00OilO00Il(list2) : null;
/* 152 */                           objInvoke2 = objArr[i5];
/* 154 */                           if (method3 != null) {
/* 168 */                               objInvoke2 = objInvoke2 != null ? method3.invoke(objInvoke2, null) : Oolli0oi0.I0000Il00O(method3.getReturnType());
                                    }
                                }
/* 175 */                       objArr2[i5] = objInvoke2;
                            }
/* 180 */                   objArr = objArr2;
                        }
                    }
/* 183 */           Object objI0000O = this.I00000oIO.I0000O(objArr);
                    return (objI0000O == Ii0111o.I00iOIl || method == null || (objInvoke = method.invoke(null, objI0000O)) == null) ? objI0000O : objInvoke;
                }

                public final IooO11l I0000oI00(int i) {
/* 1 */             IooO11l[] iooO11lArr = this.I0000O;
/* 3 */             if (i >= 0 && i < iooO11lArr.length) {
/* 8 */                 return iooO11lArr[i];
                    }
/* 13 */            if (iooO11lArr.length == 0) {
/* 17 */                return new IooO11l(i, i, 1);
                    }
/* 32 */            int length = ((IooO11l) I1IoiO1l.I001lloI(iooO11lArr)).I00iiI + 1 + (i - iooO11lArr.length);
/* 35 */            return new IooO11l(length, length, 1);
                }

                @Override
                public final Type I0001Ioi1lo() {
/* 3 */             return this.I00000oIO.I0001Ioi1lo();
                }
            }
