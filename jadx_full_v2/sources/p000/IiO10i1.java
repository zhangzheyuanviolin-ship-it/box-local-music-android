            package p000;

            import java.lang.invoke.VarHandle;
            import java.lang.reflect.Array;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.LinkedHashMap;
            import java.util.List;
            
            public abstract class IiO10i1 implements O0O0iOl1l, O0IOl1llI1I {
                public final OOoOiOo01lo I00iOIl;
                public final OOoOiOo01lo I00iiI;
                public final OOoOiOo01lo I00iiO;
                public final OOoOiOo01lo I00iio;
                public final OOoOiOo01lo I00ilI0I1;
                public final OOoOiOo01lo I00ilO0;
                public final O0ioIllo0i1 I00io1l;

                public IiO10i1() {
/* 7 */             IiO0oo iiO0oo = new IiO0oo(0);
/* 10 */            iiO0oo.I00iiI = this;
/* 12 */            VarHandle.storeStoreFence();
/* 20 */            this.I00iOIl = lIlo0Oi0oOI.I00000oIO(null, iiO0oo);
/* 25 */            IiO0oo iiO0oo2 = new IiO0oo(2);
/* 28 */            iiO0oo2.I00iiI = this;
/* 30 */            VarHandle.storeStoreFence();
/* 37 */            this.I00iiI = lIlo0Oi0oOI.I00000oIO(null, iiO0oo2);
/* 42 */            IiO0oo iiO0oo3 = new IiO0oo(3);
/* 45 */            iiO0oo3.I00iiI = this;
/* 47 */            VarHandle.storeStoreFence();
/* 54 */            this.I00iiO = lIlo0Oi0oOI.I00000oIO(null, iiO0oo3);
/* 59 */            IiO0oo iiO0oo4 = new IiO0oo(4);
/* 62 */            iiO0oo4.I00iiI = this;
/* 64 */            VarHandle.storeStoreFence();
/* 71 */            this.I00iio = lIlo0Oi0oOI.I00000oIO(null, iiO0oo4);
/* 76 */            IiO0oo iiO0oo5 = new IiO0oo(5);
/* 79 */            iiO0oo5.I00iiI = this;
/* 81 */            VarHandle.storeStoreFence();
/* 88 */            this.I00ilI0I1 = lIlo0Oi0oOI.I00000oIO(null, iiO0oo5);
/* 93 */            IiO0oo iiO0oo6 = new IiO0oo(6);
/* 96 */            iiO0oo6.I00iiI = this;
/* 98 */            VarHandle.storeStoreFence();
/* 105 */           this.I00ilO0 = lIlo0Oi0oOI.I00000oIO(null, iiO0oo6);
/* 107 */           O0oI01I0oo o0oI01I0oo = O0oI01I0oo.I00iOIl;
/* 112 */           IiO0oo iiO0oo7 = new IiO0oo(7);
/* 115 */           iiO0oo7.I00iiI = this;
/* 117 */           VarHandle.storeStoreFence();
/* 124 */           this.I00io1l = l0oi0lOi11i.I00000oIO(o0oI01I0oo, iiO0oo7);
                }

                public static Object I001IO000(IiOOIlll iiOOIlll) {
/* 7 */             Class clsI001l0I00 = ((IOIO10iOi1) l0ii0ooi.I00000oOI(iiOOIlll)).I001l0I00();
/* 15 */            if (clsI001l0I00.isArray()) {
/* 22 */                return Array.newInstance(clsI001l0I00.getComponentType(), 0);
                    }
/* 186 */           throw new Ii01OOool("Cannot instantiate the default empty array of type " + clsI001l0I00.getSimpleName() + ", because it is not an array type");
                }

                public final Object I0000O(Object... objArr) throws I1o1lOlooI1 {
                    try {
/* 5 */                 return I001l0I00().I0000O(objArr);
                    } catch (IllegalAccessException e) {
/* 49 */                throw new I1o1lOlooI1(e);
                    }
                }

                @Override
                public final O0O01O0o I0001Ioi1lo() {
/* 7 */             return (O0O01O0o) this.I00iio.invoke();
                }

                @Override
                public final List I000II() {
/* 7 */             return (List) this.I00iiO.invoke();
                }

                @Override
                public final Object I000OOo1O(LinkedHashMap linkedHashMap) throws I1o1lOlooI1 {
                    Object objI001IO000;
/* 11 */            boolean z = false;
/* 15 */            if (I00IO1()) {
/* 17 */                List<O0IooIIl00> listI000II = I000II();
/* 31 */                ArrayList arrayList = new ArrayList(IOOi1I.I0000O(listI000II, 10));
/* 42 */                for (O0IooIIl00 o0IooIIl00 : listI000II) {
/* 54 */                    if (linkedHashMap.containsKey(o0IooIIl00)) {
/* 56 */                        objI001IO000 = linkedHashMap.get(o0IooIIl00);
/* 60 */                        if (objI001IO000 == null) {
/* 87 */                            throw new IllegalArgumentException("Annotation argument value cannot be null (" + o0IooIIl00 + ')');
                                }
                            } else {
/* 88 */                        IiO1l1i iiO1l1i = (IiO1l1i) o0IooIIl00;
/* 94 */                        if (iiO1l1i.I00100o1O0lo()) {
/* 96 */                            objI001IO000 = null;
                                } else {
/* 102 */                           if (!iiO1l1i.I0010I0i()) {
/* 116 */                               IioIoO10iOiI.I000OiO("No argument provided for a required parameter: ", iiO1l1i);
/* 14 */                                return null;
                                    }
/* 108 */                           objI001IO000 = I001IO000(iiO1l1i.I000l1());
                                }
                            }
/* 112 */                   arrayList.add(objI001IO000);
                        }
/* 120 */               IIiOlII iIiOlIII001lllioOl = I001lllioOl();
/* 124 */               if (iIiOlIII001lllioOl == null) {
/* 148 */                   IOOlIIilOl0.I000OOo1O("This callable does not support a default call: ", I001lloI());
/* 14 */                    return null;
                        }
                        try {
/* 132 */                   return iIiOlIII001lllioOl.I0000O(arrayList.toArray(new Object[0]));
                        } catch (IllegalAccessException e) {
/* 143 */                   throw new I1o1lOlooI1(e);
                        }
                    }
/* 152 */           List<O0IooIIl00> listI000II2 = I000II();
/* 160 */           if (listI000II2.isEmpty()) {
                        try {
/* 179 */                   return I001l0I00().I0000O(I00100l0() ? new IOoil1iiIilo[]{null} : new IOoil1iiIilo[0]);
                        } catch (IllegalAccessException e2) {
/* 190 */                   throw new I1o1lOlooI1(e2);
                        }
                    }
/* 199 */           int size = (I00100l0() ? 1 : 0) + listI000II2.size();
/* 212 */           Object[] objArr = (Object[]) ((Object[]) this.I00ilO0.invoke()).clone();
/* 218 */           if (I00100l0()) {
/* 224 */               objArr[listI000II2.size()] = null;
                    }
/* 234 */           boolean zBooleanValue = ((Boolean) this.I00io1l.getValue()).booleanValue();
/* 242 */           int i = 0;
/* 247 */           for (O0IooIIl00 o0IooIIl002 : listI000II2) {
/* 263 */               int iI00II0Ol1O0l = zBooleanValue ? I00II0Ol1O0l(o0IooIIl002) : 1;
/* 268 */               if (linkedHashMap.containsKey(o0IooIIl002)) {
/* 279 */                   objArr[((IiO1l1i) o0IooIIl002).I00iiI] = linkedHashMap.get(o0IooIIl002);
                        } else {
/* 283 */                   IiO1l1i iiO1l1i2 = (IiO1l1i) o0IooIIl002;
/* 289 */                   if (iiO1l1i2.I00100o1O0lo()) {
/* 291 */                       if (zBooleanValue) {
/* 293 */                           int i2 = i + iI00II0Ol1O0l;
/* 296 */                           for (int i3 = i; i3 < i2; i3++) {
/* 300 */                               int i4 = (i3 / 32) + size;
/* 319 */                               objArr[i4] = Integer.valueOf(((Integer) objArr[i4]).intValue() | (1 << (i3 % 32)));
                                    }
                                } else {
/* 326 */                           int i5 = (i / 32) + size;
/* 344 */                           objArr[i5] = Integer.valueOf(((Integer) objArr[i5]).intValue() | (1 << (i % 32)));
                                }
/* 346 */                       z = true;
                            } else if (!iiO1l1i2.I0010I0i()) {
/* 364 */                       IioIoO10iOiI.I000OiO("No argument provided for a required parameter: ", iiO1l1i2);
/* 14 */                        return null;
                            }
                        }
/* 360 */               if (((IiO1l1i) o0IooIIl002).I00iiO == O0Ioo0o.I00iio) {
/* 362 */                   i += iI00II0Ol1O0l;
                        }
                    }
/* 368 */           if (!z) {
                        try {
/* 378 */                   return I001l0I00().I0000O(Arrays.copyOf(objArr, size));
                        } catch (IllegalAccessException e3) {
/* 389 */                   throw new I1o1lOlooI1(e3);
                        }
                    }
/* 390 */           IIiOlII iIiOlIII001lllioOl2 = I001lllioOl();
/* 394 */           if (iIiOlIII001lllioOl2 == null) {
/* 412 */               IOOlIIilOl0.I000OOo1O("This callable does not support a default call: ", I001lloI());
/* 14 */                return null;
                    }
                    try {
/* 396 */               return iIiOlIII001lllioOl2.I0000O(objArr);
                    } catch (IllegalAccessException e4) {
/* 407 */               throw new I1o1lOlooI1(e4);
                    }
                }

                @Override
                public final List I001iOo1i0O() {
/* 7 */             return (List) this.I00iOIl.invoke();
                }

                public abstract IIiOlII I001l0I00();

                public abstract O0IiOio0lo0 I001lIiIIo1O();

                public abstract IIiOlII I001lllioOl();

                public abstract IIiO00o1o I001lloI();

                public final int I00II0Ol1O0l(O0IooIIl00 o0IooIIl00) {
/* 13 */            if (!((Boolean) this.I00io1l.getValue()).booleanValue()) {
/* 50 */                I000II.I000iOII("Check if parametersNeedMFVCFlattening is true before");
/* 53 */                return 0;
                    }
/* 15 */            IiO1l1i iiO1l1i = (IiO1l1i) o0IooIIl00;
/* 25 */            if (Oolli0oi0.I0000oI00(iiO1l1i.I000l1())) {
/* 41 */                return li1O10Oli1i1.I0000oI00(lOoil0Io0Io.I00000oIO(iiO1l1i.I000l1().I00iiI)).size();
                    }
/* 46 */            return 1;
                }

                public abstract Object I00II0oii1o();

                public final boolean I00IO1() {
                    return O0000Ioio00.I0000O(getName(), "<init>") && I001lIiIIo1O().I001l0I00().isAnnotation();
                }

                @Override
                public final List getTypeParameters() {
/* 7 */             return (List) this.I00ilI0I1.invoke();
                }
            }
