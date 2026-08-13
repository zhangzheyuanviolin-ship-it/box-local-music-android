            package p000;

            import java.io.Serializable;
            import java.lang.invoke.VarHandle;
            import java.util.AbstractMap;
            import java.util.Set;
            
            public final class lo0olliO11 extends AbstractMap implements Serializable {
                public static final OiOIlO1OII0 I00l0I0l0lO1 = new OiOIlO1OII0(17);
                public final boolean I00iiI;
                public O100l1 I00iiO;
                public final O100l1 I00ilO0;
                public lo0IO0l1I I00io1l;
                public lo0IO0l1I I00ioIO;
                public int I00iio = 0;
                public int I00ilI0I1 = 0;
                public final OiOIlO1OII0 I00iOIl = I00l0I0l0lO1;

                public lo0olliO11(boolean z) {
/* 13 */            this.I00iiI = z;
/* 18 */            O100l1 o100l1 = new O100l1(1);
/* 22 */            o100l1.I00iiI = null;
/* 24 */            o100l1.I00iiO = z;
/* 26 */            o100l1.I00l0OO0IO = o100l1;
/* 28 */            o100l1.I00l0I0l0lO1 = o100l1;
/* 30 */            VarHandle.storeStoreFence();
/* 33 */            this.I00ilO0 = o100l1;
                }

                public final O100l1 I00000oIO(Object obj, boolean z) {
                    int iCompareTo;
                    O100l1 o100l1;
/* 1 */             O100l1 o100l12 = this.I00iiO;
/* 4 */             OiOIlO1OII0 oiOIlO1OII0 = I00l0I0l0lO1;
/* 6 */             OiOIlO1OII0 oiOIlO1OII02 = this.I00iOIl;
/* 8 */             if (o100l12 != null) {
/* 16 */                Comparable comparable = oiOIlO1OII02 == oiOIlO1OII0 ? (Comparable) obj : null;
                        while (true) {
/* 17 */                    Object obj2 = o100l12.I00iiI;
/* 26 */                    iCompareTo = comparable != null ? comparable.compareTo(obj2) : oiOIlO1OII02.compare(obj, obj2);
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
/* 45 */            int i = iCompareTo;
/* 51 */            if (!z) {
/* 3 */                 return null;
                    }
/* 55 */            O100l1 o100l14 = this.I00ilO0;
/* 57 */            if (o100l12 != null) {
/* 105 */               O100l1 o100l15 = o100l12;
/* 118 */               o100l1 = new O100l1(this.I00iiI, o100l15, obj, o100l14, (O100l1) o100l14.I00l0OO0IO, (byte) 0);
/* 121 */               if (i < 0) {
/* 123 */                   o100l15.I00io1l = o100l1;
                        } else {
/* 126 */                   o100l15.I00ioIO = o100l1;
                        }
/* 128 */               I0000O(o100l15, true);
                    } else {
/* 59 */                if (oiOIlO1OII02 == oiOIlO1OII0 && !(obj instanceof Comparable)) {
/* 85 */                    throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
                        }
/* 99 */                o100l1 = new O100l1(this.I00iiI, null, obj, o100l14, (O100l1) o100l14.I00l0OO0IO, (byte) 0);
/* 102 */               this.I00iiO = o100l1;
                    }
                    this.I00iio++;
                    this.I00ilI0I1++;
/* 332 */           return o100l1;
                }

                public final void I00000oOI(O100l1 o100l1, boolean z) {
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
/* 109 */               if (o100l15 != null) {
/* 111 */                   I0000Il00O(o100l1, o100l15);
/* 114 */                   o100l1.I00io1l = null;
                        } else if (o100l16 != null) {
/* 119 */                   I0000Il00O(o100l1, o100l16);
/* 122 */                   o100l1.I00ioIO = null;
                        } else {
/* 125 */                   I0000Il00O(o100l1, null);
                        }
/* 128 */               I0000O(o100l17, false);
                        this.I00iio--;
                        this.I00ilI0I1++;
/* 332 */               return;
                    }
/* 41 */            if (o100l15.I00ilI0I1 > o100l16.I00ilI0I1) {
/* 50 */                do {
/* 48 */                    o100l13 = o100l15;
/* 45 */                    o100l15 = (O100l1) o100l15.I00ioIO;
/* 50 */                } while (o100l15 != null);
                    } else {
/* 60 */                do {
/* 57 */                    o100l12 = o100l16;
/* 55 */                    o100l16 = (O100l1) o100l16.I00io1l;
/* 60 */                } while (o100l16 != null);
/* 63 */                o100l13 = o100l12;
                    }
/* 64 */            I00000oOI(o100l13, false);
/* 69 */            O100l1 o100l18 = (O100l1) o100l1.I00io1l;
/* 71 */            if (o100l18 != null) {
/* 73 */                i = o100l18.I00ilI0I1;
/* 75 */                o100l13.I00io1l = o100l18;
/* 77 */                o100l18.I00ilO0 = o100l13;
/* 79 */                o100l1.I00io1l = null;
                    } else {
/* 82 */                i = 0;
                    }
/* 85 */            O100l1 o100l19 = (O100l1) o100l1.I00ioIO;
/* 87 */            if (o100l19 != null) {
/* 89 */                i2 = o100l19.I00ilI0I1;
/* 91 */                o100l13.I00ioIO = o100l19;
/* 93 */                o100l19.I00ilO0 = o100l13;
/* 95 */                o100l1.I00ioIO = null;
                    }
/* 103 */           o100l13.I00ilI0I1 = Math.max(i, i2) + 1;
/* 105 */           I0000Il00O(o100l1, o100l13);
                }

                public final void I0000Il00O(O100l1 o100l1, O100l1 o100l12) {
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

                /* JADX WARN: Removed duplicated region for block: B:60:0x0092 A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:61:0x0092 A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:64:0x008c A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:67:0x008c A[SYNTHETIC] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I0000O(O100l1 o100l1, boolean z) {
/* 1 */             while (o100l1 != null) {
/* 5 */                 O100l1 o100l12 = (O100l1) o100l1.I00io1l;
/* 9 */                 O100l1 o100l13 = (O100l1) o100l1.I00ioIO;
/* 11 */                boolean z2 = false;
/* 17 */                int i = o100l12 != null ? o100l12.I00ilI0I1 : 0;
/* 23 */                int i2 = o100l13 != null ? o100l13.I00ilI0I1 : 0;
/* 24 */                int i3 = i - i2;
/* 27 */                boolean z3 = true;
/* 28 */                if (i3 == -2) {
/* 32 */                    O100l1 o100l14 = (O100l1) o100l13.I00io1l;
/* 36 */                    O100l1 o100l15 = (O100l1) o100l13.I00ioIO;
/* 50 */                    int i4 = (o100l14 != null ? o100l14.I00ilI0I1 : 0) - (o100l15 != null ? o100l15.I00ilI0I1 : 0);
/* 52 */                    if (i4 != -1) {
/* 54 */                        if (i4 == 0) {
/* 56 */                            if (!z) {
                                    }
/* 72 */                            if (z3) {
/* 332 */                               return;
                                    }
                                } else {
/* 59 */                            z3 = z;
                                }
/* 60 */                        I000O01llI0(o100l13);
/* 63 */                        I000II(o100l1);
/* 72 */                        if (z3) {
                                }
                            } else {
/* 67 */                        z2 = z;
                            }
/* 68 */                    I000II(o100l1);
/* 71 */                    z3 = z2;
/* 72 */                    if (z3) {
                            }
                        } else if (i3 == 2) {
/* 80 */                    O100l1 o100l16 = (O100l1) o100l12.I00io1l;
/* 84 */                    O100l1 o100l17 = (O100l1) o100l12.I00ioIO;
/* 98 */                    int i5 = (o100l16 != null ? o100l16.I00ilI0I1 : 0) - (o100l17 != null ? o100l17.I00ilI0I1 : 0);
/* 99 */                    if (i5 != 1) {
/* 101 */                       if (i5 == 0) {
/* 103 */                           if (!z) {
                                    }
/* 119 */                           if (z3) {
/* 332 */                               return;
                                    }
                                } else {
/* 106 */                           z3 = z;
                                }
/* 107 */                       I000II(o100l12);
/* 110 */                       I000O01llI0(o100l1);
/* 119 */                       if (z3) {
                                }
                            } else {
/* 114 */                       z2 = z;
                            }
/* 115 */                   I000O01llI0(o100l1);
/* 118 */                   z3 = z2;
/* 119 */                   if (z3) {
                            }
                        } else if (i3 == 0) {
/* 126 */                   o100l1.I00ilI0I1 = i + 1;
/* 128 */                   if (z) {
/* 332 */                       return;
                            }
                        } else {
/* 136 */                   o100l1.I00ilI0I1 = Math.max(i, i2) + 1;
/* 138 */                   if (!z) {
/* 332 */                       return;
                            }
                        }
/* 143 */               o100l1 = (O100l1) o100l1.I00ilO0;
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
/* 23 */            I0000Il00O(o100l1, o100l13);
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
/* 23 */            I0000Il00O(o100l1, o100l12);
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
/* 1 */             lo0IO0l1I lo0io0l1i = this.I00io1l;
/* 3 */             if (lo0io0l1i != null) {
/* 20 */                return lo0io0l1i;
                    }
/* 8 */             lo0IO0l1I lo0io0l1i2 = new lo0IO0l1I(this, 0);
/* 11 */            this.I00io1l = lo0io0l1i2;
/* 20 */            return lo0io0l1i2;
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
/* 1 */             lo0IO0l1I lo0io0l1i = this.I00ioIO;
/* 3 */             if (lo0io0l1i != null) {
/* 20 */                return lo0io0l1i;
                    }
/* 8 */             lo0IO0l1I lo0io0l1i2 = new lo0IO0l1I(this, 1);
/* 11 */            this.I00ioIO = lo0io0l1i2;
/* 20 */            return lo0io0l1i2;
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
/* 14 */                I00000oOI(o100l1I00000oIO, true);
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
