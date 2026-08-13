            package p000;

            import java.lang.reflect.Member;
            import java.lang.reflect.Method;
            import java.lang.reflect.Type;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            
/* 172 */   public final class I111li implements IIiOlII {
                public final Class I00000oIO;
                public final ArrayList I00000oOI;
                public final I111l1 I0000Il00O;
                public final List I0000O;
                public final ArrayList I0000oI00;
                public final ArrayList I0001Ioi1lo;
                public final ArrayList I000II;

                public I111li(Class cls, ArrayList arrayList, I111l1 i111l1, I111lIl i111lIl, List list) {
/* 4 */             this.I00000oIO = cls;
/* 6 */             this.I00000oOI = arrayList;
/* 8 */             this.I0000Il00O = i111l1;
/* 10 */            this.I0000O = list;
/* 12 */            List list2 = list;
/* 22 */            ArrayList arrayList2 = new ArrayList(IOOi1I.I0000O(list2, 10));
/* 25 */            Iterator it = list2.iterator();
/* 33 */            while (it.hasNext()) {
/* 45 */                arrayList2.add(((Method) it.next()).getGenericReturnType());
                    }
/* 49 */            this.I0000oI00 = arrayList2;
/* 51 */            List list3 = this.I0000O;
/* 61 */            ArrayList arrayList3 = new ArrayList(IOOi1I.I0000O(list3, 10));
/* 64 */            Iterator it2 = list3.iterator();
/* 72 */            while (it2.hasNext()) {
/* 80 */                Class<?> returnType = ((Method) it2.next()).getReturnType();
/* 90 */                Class<?> cls2 = (Class) OOo1Io0I0.I0000Il00O.get(returnType);
/* 92 */                if (cls2 != null) {
/* 95 */                    returnType = cls2;
                        }
/* 96 */                arrayList3.add(returnType);
                    }
/* 100 */           this.I0001Ioi1lo = arrayList3;
/* 102 */           List list4 = this.I0000O;
/* 112 */           ArrayList arrayList4 = new ArrayList(IOOi1I.I0000O(list4, 10));
/* 115 */           Iterator it3 = list4.iterator();
/* 123 */           while (it3.hasNext()) {
/* 135 */               arrayList4.add(((Method) it3.next()).getDefaultValue());
                    }
/* 139 */           this.I000II = arrayList4;
/* 145 */           if (this.I0000Il00O == I111l1.I00iiI && i111lIl == I111lIl.I00iOIl && !IOOi0Ool1i.I00Iooi00oi(this.I00000oOI, "value").isEmpty()) {
/* 168 */               OoOil11Ol1o.I000OiO("Positional call of a Java annotation constructor is allowed only if there are no parameters or one parameter named \"value\". This restriction exists because Java annotations (in contrast to Kotlin)do not impose any order on their arguments. Use KCallable#callBy instead.");
/* 172 */               throw null;
                    }
                }

                @Override
                public final List I00000oIO() {
/* 1 */             return this.I0000oI00;
                }

                @Override
                public final Member I00000oOI() {
/* 1 */             return null;
                }

                @Override
                public final boolean I0000Il00O() {
/* 1 */             return false;
                }

                /* JADX WARN: Removed duplicated region for block: B:35:0x008a  */
                /* JADX WARN: Removed duplicated region for block: B:52:0x013b A[LOOP:0: B:5:0x0015->B:52:0x013b, LOOP_END] */
                /* JADX WARN: Removed duplicated region for block: B:58:0x008e A[SYNTHETIC] */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I0000O(Object[] objArr) {
                    Object obj;
                    O0IOli0o0 o0IOli0o0I00000oOI;
                    OOoOl1001II oOoOl1001II;
/* 10 */            if (iOil0li.I00000oIO(this) != objArr.length) {
/* 347 */               StringBuilder sb = new StringBuilder("Callable expects ");
/* 354 */               sb.append(iOil0li.I00000oIO(this));
/* 359 */               sb.append(" arguments, but ");
/* 369 */               I000II.I000iOII(IIl001iO0Io.I000lI(objArr.length, " were provided.", sb));
/* 341 */               return null;
                    }
/* 15 */            ArrayList arrayList = new ArrayList(objArr.length);
/* 18 */            int length = objArr.length;
/* 20 */            int i = 0;
/* 21 */            int i2 = 0;
                    while (true) {
/* 22 */                ArrayList arrayList2 = this.I00000oOI;
/* 24 */                if (i >= length) {
/* 336 */                   return iOO0O10.I00000oIO(this.I00000oIO, O1Oii0O0loo.I000OiO(IOOi0Ool1i.I00ilO0(arrayList2, arrayList)), this.I0000O);
                        }
/* 26 */                Object array = objArr[i];
/* 28 */                int i3 = i2 + 1;
/* 30 */                ArrayList arrayList3 = this.I0001Ioi1lo;
/* 32 */                if (array == null && this.I0000Il00O == I111l1.I00iOIl) {
/* 42 */                    array = this.I000II.get(i2);
                        } else {
/* 53 */                    Class cls = (Class) arrayList3.get(i2);
/* 57 */                    if (!(array instanceof Class)) {
/* 63 */                        if (array instanceof O0IOli0o0) {
/* 69 */                            array = ((IOIO10iOi1) ((O0IOli0o0) array)).I001l0I00();
                                } else {
/* 78 */                            if (array instanceof Object[]) {
/* 81 */                                Object[] objArr2 = (Object[]) array;
/* 85 */                                if (!(objArr2 instanceof Class[])) {
/* 90 */                                    if (objArr2 instanceof O0IOli0o0[]) {
/* 92 */                                        O0IOli0o0[] o0IOli0o0Arr = (O0IOli0o0[]) array;
/* 97 */                                        ArrayList arrayList4 = new ArrayList(o0IOli0o0Arr.length);
/* 102 */                                       for (O0IOli0o0 o0IOli0o0 : o0IOli0o0Arr) {
/* 114 */                                           arrayList4.add(((IOIO10iOi1) o0IOli0o0).I001l0I00());
                                                }
/* 120 */                                       obj = null;
/* 124 */                                       array = arrayList4.toArray(new Class[0]);
                                            } else {
/* 129 */                                       obj = null;
/* 131 */                                       array = objArr2;
                                            }
                                        }
                                    }
/* 136 */                           if (!cls.isInstance(array)) {
/* 139 */                               array = obj;
                                    }
/* 141 */                           if (array == null) {
/* 147 */                               String str = (String) arrayList2.get(i2);
/* 153 */                               Class cls2 = (Class) arrayList3.get(i2);
/* 161 */                               if (O0000Ioio00.I0000O(cls2, Class.class)) {
/* 163 */                                   oOoOl1001II = OOoOl0i.I00000oIO;
/* 167 */                                   o0IOli0o0I00000oOI = oOoOl1001II.I00000oOI(O0IOli0o0.class);
                                        } else if (cls2.isArray() && O0000Ioio00.I0000O(cls2.getComponentType(), Class.class)) {
/* 188 */                                   oOoOl1001II = OOoOl0i.I00000oIO;
/* 192 */                                   o0IOli0o0I00000oOI = oOoOl1001II.I00000oOI(O0IOli0o0[].class);
                                        } else {
/* 197 */                                   OOoOl1001II oOoOl1001II2 = OOoOl0i.I00000oIO;
/* 199 */                                   o0IOli0o0I00000oOI = oOoOl1001II2.I00000oOI(cls2);
/* 206 */                                   oOoOl1001II = oOoOl1001II2;
                                        }
/* 315 */                               throw new IllegalArgumentException("Argument #" + i2 + ' ' + str + " is not of the required type " + (O0000Ioio00.I0000O(o0IOli0o0I00000oOI.I000O01llI0(), oOoOl1001II.I00000oOI(Object[].class).I000O01llI0()) ? o0IOli0o0I00000oOI.I000O01llI0() + '<' + oOoOl1001II.I00000oOI(((IOIO10iOi1) o0IOli0o0I00000oOI).I001l0I00().getComponentType()).I000O01llI0() + '>' : o0IOli0o0I00000oOI.I000O01llI0()));
                                    }
/* 316 */                           arrayList.add(array);
/* 319 */                           i++;
/* 321 */                           i2 = i3;
                                }
/* 73 */                        obj = null;
/* 136 */                       if (!cls.isInstance(array)) {
                                }
/* 141 */                       if (array == null) {
                                }
                            }
/* 59 */                    array = null;
                        }
/* 141 */               if (array == null) {
                        }
                    }
                }

                @Override
                public final Type I0001Ioi1lo() {
/* 1 */             return this.I00000oIO;
                }

/* 173 */       public I111li(Class cls, ArrayList arrayList, I111l1 i111l1) {
                    I111lIl i111lIl = I111lIl.I00iiI;
/* 174 */           ArrayList arrayList2 = new ArrayList(IOOi1I.I0000O(arrayList, 10));
/* 175 */           Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
/* 178 */               arrayList2.add(cls.getDeclaredMethod((String) it.next(), null));
                    }
/* 179 */           this(cls, arrayList, i111l1, i111lIl, arrayList2);
                }
            }
