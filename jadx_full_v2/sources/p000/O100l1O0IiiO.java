            package p000;

            import java.io.Serializable;
            import java.lang.invoke.VarHandle;
            import java.util.AbstractMap;
            import java.util.Comparator;
            import java.util.Map;
            import java.util.Set;
            
            public final class O100l1O0IiiO extends AbstractMap implements Serializable {
                public static final IliIiio1 I00l0I0l0lO1 = new IliIiio1(23);
                public final boolean I00iiI;
                public O100l1 I00iiO;
                public final O100l1 I00ilO0;
                public O100Oo I00io1l;
                public O100Oo I00ioIO;
                public int I00iio = 0;
                public int I00ilI0I1 = 0;
                public final Comparator I00iOIl = I00l0I0l0lO1;

                public O100l1O0IiiO(boolean z) {
/* 13 */            this.I00iiI = z;
/* 17 */            O100l1 o100l1 = new O100l1(0);
/* 21 */            o100l1.I00iiI = null;
/* 23 */            o100l1.I00iiO = z;
/* 25 */            o100l1.I00l0OO0IO = o100l1;
/* 27 */            o100l1.I00l0I0l0lO1 = o100l1;
/* 29 */            VarHandle.storeStoreFence();
/* 32 */            this.I00ilO0 = o100l1;
                }

                public final O100l1 I00000oIO(Object obj, boolean z) {
                    int iCompareTo;
                    O100l1 o100l1;
/* 1 */             O100l1 o100l12 = this.I00iiO;
/* 4 */             IliIiio1 iliIiio1 = I00l0I0l0lO1;
/* 6 */             Comparator comparator = this.I00iOIl;
/* 8 */             if (o100l12 != null) {
/* 16 */                Comparable comparable = comparator == iliIiio1 ? (Comparable) obj : null;
                        while (true) {
/* 17 */                    Object obj2 = o100l12.I00iiI;
/* 26 */                    iCompareTo = comparable != null ? comparable.compareTo(obj2) : comparator.compare(obj, obj2);
/* 30 */                    if (iCompareTo == 0) {
/* 32 */                        return o100l12;
                            }
/* 37 */                    O100l1 o100l13 = (O100l1) (iCompareTo < 0 ? o100l12.I00io1l : o100l12.I00ioIO);
/* 43 */                    if (o100l13 == null) {
                                break;
                            }
/* 47 */                    o100l12 = o100l13;
                        }
                    } else {
/* 49 */                iCompareTo = 0;
                    }
/* 45 */            O100l1 o100l14 = o100l12;
/* 51 */            if (!z) {
/* 3 */                 return null;
                    }
/* 55 */            O100l1 o100l15 = this.I00ilO0;
/* 57 */            if (o100l14 != null) {
/* 112 */               o100l1 = new O100l1(this.I00iiI, o100l14, obj, o100l15, (O100l1) o100l15.I00l0OO0IO);
/* 115 */               if (iCompareTo < 0) {
/* 117 */                   o100l14.I00io1l = o100l1;
                        } else {
/* 120 */                   o100l14.I00ioIO = o100l1;
                        }
/* 122 */               I00000oOI(o100l14, true);
                    } else {
/* 59 */                if (comparator == iliIiio1 && !(obj instanceof Comparable)) {
/* 85 */                    throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
                        }
/* 96 */                o100l1 = new O100l1(this.I00iiI, o100l14, obj, o100l15, (O100l1) o100l15.I00l0OO0IO);
/* 99 */                this.I00iiO = o100l1;
                    }
                    this.I00iio++;
                    this.I00ilI0I1++;
/* 551 */           return o100l1;
                }

                public final void I00000oOI(O100l1 o100l1, boolean z) {
/* 1 */             while (o100l1 != null) {
/* 5 */                 O100l1 o100l12 = (O100l1) o100l1.I00io1l;
/* 9 */                 O100l1 o100l13 = (O100l1) o100l1.I00ioIO;
/* 17 */                int i = o100l12 != null ? o100l12.I00ilI0I1 : 0;
/* 23 */                int i2 = o100l13 != null ? o100l13.I00ilI0I1 : 0;
/* 24 */                int i3 = i - i2;
/* 27 */                if (i3 == -2) {
/* 31 */                    O100l1 o100l14 = (O100l1) o100l13.I00io1l;
/* 35 */                    O100l1 o100l15 = (O100l1) o100l13.I00ioIO;
/* 47 */                    int i4 = (o100l14 != null ? o100l14.I00ilI0I1 : 0) - (o100l15 != null ? o100l15.I00ilI0I1 : 0);
/* 49 */                    if (i4 == -1 || (i4 == 0 && !z)) {
/* 63 */                        I000II(o100l1);
                            } else {
/* 56 */                        I000O01llI0(o100l13);
/* 59 */                        I000II(o100l1);
                            }
/* 66 */                    if (z) {
/* 551 */                       return;
                            }
                        } else if (i3 == 2) {
/* 75 */                    O100l1 o100l16 = (O100l1) o100l12.I00io1l;
/* 79 */                    O100l1 o100l17 = (O100l1) o100l12.I00ioIO;
/* 91 */                    int i5 = (o100l16 != null ? o100l16.I00ilI0I1 : 0) - (o100l17 != null ? o100l17.I00ilI0I1 : 0);
/* 92 */                    if (i5 == 1 || (i5 == 0 && !z)) {
/* 106 */                       I000O01llI0(o100l1);
                            } else {
/* 99 */                        I000II(o100l12);
/* 102 */                       I000O01llI0(o100l1);
                            }
/* 109 */                   if (z) {
/* 551 */                       return;
                            }
                        } else if (i3 == 0) {
/* 116 */                   o100l1.I00ilI0I1 = i + 1;
/* 118 */                   if (z) {
/* 551 */                       return;
                            }
                        } else {
/* 126 */                   o100l1.I00ilI0I1 = Math.max(i, i2) + 1;
/* 128 */                   if (!z) {
/* 551 */                       return;
                            }
                        }
/* 133 */               o100l1 = (O100l1) o100l1.I00ilO0;
                    }
                }

                public final void I0000Il00O(O100l1 o100l1, boolean z) {
                    O100l1 o100l12;
                    O100l1 o100l13;
                    int i;
/* 1 */             if (z) {
/* 5 */                 O100l1 o100l14 = (O100l1) o100l1.I00l0OO0IO;
/* 11 */                o100l14.I00l0I0l0lO1 = (O100l1) o100l1.I00l0I0l0lO1;
/* 17 */                ((O100l1) o100l1.I00l0I0l0lO1).I00l0OO0IO = o100l14;
                    }
/* 21 */            O100l1 o100l15 = (O100l1) o100l1.I00io1l;
/* 25 */            O100l1 o100l16 = (O100l1) o100l1.I00ioIO;
/* 29 */            O100l1 o100l17 = (O100l1) o100l1.I00ilO0;
/* 31 */            int i2 = 0;
/* 33 */            if (o100l15 == null || o100l16 == null) {
/* 117 */               if (o100l15 != null) {
/* 119 */                   I0000O(o100l1, o100l15);
/* 122 */                   o100l1.I00io1l = null;
                        } else if (o100l16 != null) {
/* 127 */                   I0000O(o100l1, o100l16);
/* 130 */                   o100l1.I00ioIO = null;
                        } else {
/* 133 */                   I0000O(o100l1, null);
                        }
/* 136 */               I00000oOI(o100l17, false);
                        this.I00iio--;
                        this.I00ilI0I1++;
/* 551 */               return;
                    }
/* 41 */            if (o100l15.I00ilI0I1 > o100l16.I00ilI0I1) {
/* 43 */                Map.Entry entry = o100l15.I00ioIO;
                        while (true) {
/* 45 */                    O100l1 o100l18 = (O100l1) entry;
/* 48 */                    o100l13 = o100l15;
/* 49 */                    o100l15 = o100l18;
/* 50 */                    if (o100l15 == null) {
                                break;
                            } else {
/* 52 */                        entry = o100l15.I00ioIO;
                            }
                        }
                    } else {
/* 57 */                Map.Entry entry2 = o100l16.I00io1l;
                        while (true) {
/* 61 */                    o100l12 = o100l16;
/* 59 */                    o100l16 = (O100l1) entry2;
/* 64 */                    if (o100l16 == null) {
                                break;
                            } else {
/* 66 */                        entry2 = o100l16.I00io1l;
                            }
                        }
/* 71 */                o100l13 = o100l12;
                    }
/* 72 */            I0000Il00O(o100l13, false);
/* 77 */            O100l1 o100l19 = (O100l1) o100l1.I00io1l;
/* 79 */            if (o100l19 != null) {
/* 81 */                i = o100l19.I00ilI0I1;
/* 83 */                o100l13.I00io1l = o100l19;
/* 85 */                o100l19.I00ilO0 = o100l13;
/* 87 */                o100l1.I00io1l = null;
                    } else {
/* 90 */                i = 0;
                    }
/* 93 */            O100l1 o100l110 = (O100l1) o100l1.I00ioIO;
/* 95 */            if (o100l110 != null) {
/* 97 */                i2 = o100l110.I00ilI0I1;
/* 99 */                o100l13.I00ioIO = o100l110;
/* 101 */               o100l110.I00ilO0 = o100l13;
/* 103 */               o100l1.I00ioIO = null;
                    }
/* 111 */           o100l13.I00ilI0I1 = Math.max(i, i2) + 1;
/* 113 */           I0000O(o100l1, o100l13);
                }

                public final void I0000O(O100l1 o100l1, O100l1 o100l12) {
/* 3 */             O100l1 o100l13 = (O100l1) o100l1.I00ilO0;
/* 6 */             o100l1.I00ilO0 = null;
/* 8 */             if (o100l12 != null) {
/* 10 */                o100l12.I00ilO0 = o100l13;
                    }
/* 12 */            if (o100l13 == null) {
/* 26 */                this.I00iiO = o100l12;
                    } else if (((O100l1) o100l13.I00io1l) == o100l1) {
/* 20 */                o100l13.I00io1l = o100l12;
                    } else {
/* 23 */                o100l13.I00ioIO = o100l12;
                    }
                }

                public final void I000II(O100l1 o100l1) {
/* 3 */             O100l1 o100l12 = (O100l1) o100l1.I00io1l;
/* 7 */             O100l1 o100l13 = (O100l1) o100l1.I00ioIO;
/* 11 */            O100l1 o100l14 = (O100l1) o100l13.I00io1l;
/* 15 */            O100l1 o100l15 = (O100l1) o100l13.I00ioIO;
/* 17 */            o100l1.I00ioIO = o100l14;
/* 19 */            if (o100l14 != null) {
/* 21 */                o100l14.I00ilO0 = o100l1;
                    }
/* 23 */            I0000O(o100l1, o100l13);
/* 26 */            o100l13.I00io1l = o100l1;
/* 28 */            o100l1.I00ilO0 = o100l13;
/* 47 */            int iMax = Math.max(o100l12 != null ? o100l12.I00ilI0I1 : 0, o100l14 != null ? o100l14.I00ilI0I1 : 0) + 1;
/* 49 */            o100l1.I00ilI0I1 = iMax;
/* 61 */            o100l13.I00ilI0I1 = Math.max(iMax, o100l15 != null ? o100l15.I00ilI0I1 : 0) + 1;
                }

                public final void I000O01llI0(O100l1 o100l1) {
/* 3 */             O100l1 o100l12 = (O100l1) o100l1.I00io1l;
/* 7 */             O100l1 o100l13 = (O100l1) o100l1.I00ioIO;
/* 11 */            O100l1 o100l14 = (O100l1) o100l12.I00io1l;
/* 15 */            O100l1 o100l15 = (O100l1) o100l12.I00ioIO;
/* 17 */            o100l1.I00io1l = o100l15;
/* 19 */            if (o100l15 != null) {
/* 21 */                o100l15.I00ilO0 = o100l1;
                    }
/* 23 */            I0000O(o100l1, o100l12);
/* 26 */            o100l12.I00ioIO = o100l1;
/* 28 */            o100l1.I00ilO0 = o100l12;
/* 47 */            int iMax = Math.max(o100l13 != null ? o100l13.I00ilI0I1 : 0, o100l15 != null ? o100l15.I00ilI0I1 : 0) + 1;
/* 49 */            o100l1.I00ilI0I1 = iMax;
/* 61 */            o100l12.I00ilI0I1 = Math.max(iMax, o100l14 != null ? o100l14.I00ilI0I1 : 0) + 1;
                }

                @Override
                public final void clear() {
/* 2 */             this.I00iiO = null;
/* 5 */             this.I00iio = 0;
                    this.I00ilI0I1++;
/* 13 */            O100l1 o100l1 = this.I00ilO0;
/* 15 */            o100l1.I00l0OO0IO = o100l1;
/* 17 */            o100l1.I00l0I0l0lO1 = o100l1;
                }

                @Override
                public final boolean containsKey(Object obj) {
/* 2 */             O100l1 o100l1I00000oIO = null;
/* 3 */             if (obj != null) {
                        try {
/* 5 */                     o100l1I00000oIO = I00000oIO(obj, false);
                        } catch (ClassCastException unused) {
                        }
                    }
                    return o100l1I00000oIO != null;
                }

                @Override
                public final Set entrySet() {
/* 1 */             O100Oo o100Oo = this.I00io1l;
/* 3 */             if (o100Oo != null) {
/* 29 */                return o100Oo;
                    }
/* 8 */             O100Oo o100Oo2 = new O100Oo(this, 0);
/* 11 */            this.I00io1l = o100Oo2;
/* 29 */            return o100Oo2;
                }

                @Override
                public final Object get(Object obj) {
                    O100l1 o100l1I00000oIO;
/* 2 */             if (obj != null) {
                        try {
/* 5 */                     o100l1I00000oIO = I00000oIO(obj, false);
                        } catch (ClassCastException unused) {
                        }
                    } else {
/* 10 */                o100l1I00000oIO = null;
                    }
/* 11 */            if (o100l1I00000oIO != null) {
/* 13 */                return o100l1I00000oIO.I00iio;
                    }
/* 1 */             return null;
                }

                @Override
                public final Set keySet() {
/* 1 */             O100Oo o100Oo = this.I00ioIO;
/* 3 */             if (o100Oo != null) {
/* 29 */                return o100Oo;
                    }
/* 8 */             O100Oo o100Oo2 = new O100Oo(this, 1);
/* 11 */            this.I00ioIO = o100Oo2;
/* 29 */            return o100Oo2;
                }

                @Override
                public final Object put(Object obj, Object obj2) {
/* 2 */             if (obj == null) {
/* 29 */                IOOlIIilOl0.I000II("key == null");
/* 1 */                 return null;
                    }
/* 4 */             if (obj2 == null && !this.I00iiI) {
/* 13 */                IOOlIIilOl0.I000II("value == null");
/* 1 */                 return null;
                    }
/* 18 */            O100l1 o100l1I00000oIO = I00000oIO(obj, true);
/* 22 */            Object obj3 = o100l1I00000oIO.I00iio;
/* 24 */            o100l1I00000oIO.I00iio = obj2;
/* 26 */            return obj3;
                }

                @Override
                public final Object remove(Object obj) {
                    O100l1 o100l1I00000oIO;
/* 2 */             if (obj != null) {
                        try {
/* 5 */                     o100l1I00000oIO = I00000oIO(obj, false);
                        } catch (ClassCastException unused) {
                        }
                    } else {
/* 10 */                o100l1I00000oIO = null;
                    }
/* 11 */            if (o100l1I00000oIO != null) {
/* 14 */                I0000Il00O(o100l1I00000oIO, true);
                    }
/* 17 */            if (o100l1I00000oIO != null) {
/* 19 */                return o100l1I00000oIO.I00iio;
                    }
/* 1 */             return null;
                }

                @Override
                public final int size() {
/* 1 */             return this.I00iio;
                }
            }
