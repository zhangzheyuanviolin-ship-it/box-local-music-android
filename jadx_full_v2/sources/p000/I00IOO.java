            package p000;

            import androidx.appcompat.widget.ActionBarContextView;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.LinkedHashMap;
            
/* 21 */    public final class I00IOO implements Oooli0Olo10 {
                public static final I00IO1oi11O[] I0000O = new I00IO1oi11O[0];
                public boolean I00000oIO;
                public int I00000oOI;
                public Object I0000Il00O;

                /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
                public I00IOO(int i, boolean z) {
/* 6 */             this(10);
                    switch (i) {
                        case 4:
/* 16 */                    this.I0000Il00O = new Object[4];
/* 19 */                    this.I00000oOI = 0;
                            break;
                        default:
                            break;
                    }
                }

                public static int I000iOII(int i, int i2) {
/* 1 */             if (i2 < 0) {
/* 23 */                I000II.I000O01llI0("cannot store more than MAX_VALUE elements");
/* 26 */                return 0;
                    }
/* 6 */             int iI0000Il00O = i + (i >> 1) + 1;
/* 8 */             if (iI0000Il00O < i2) {
/* 11 */                iI0000Il00O = OooioIOo1.I0000Il00O(i2, -1);
                    }
/* 15 */            if (iI0000Il00O < 0) {
/* 17 */                return Integer.MAX_VALUE;
                    }
/* 20 */            return iI0000Il00O;
                }

                @Override
                public void I00000oIO() {
/* 2 */             this.I00000oIO = true;
                }

                @Override
                public void I00000oOI() {
/* 2 */             super/*android.view.View*/.setVisibility(0);
/* 9 */             this.I00000oIO = false;
                }

                @Override
                public void I0000Il00O() {
/* 3 */             if (this.I00000oIO) {
/* 5 */                 return;
                    }
/* 8 */             ActionBarContextView actionBarContextView = (ActionBarContextView) this.I0000Il00O;
/* 11 */            actionBarContextView.I00ilO0 = null;
/* 1 */             super/*android.view.View*/.setVisibility(this.I00000oOI);
                }

                public void I0000O(I00IO1oi11O i00IO1oi11O) {
/* 1 */             if (i00IO1oi11O == null) {
/* 54 */                IOOlIIilOl0.I000II("'element' cannot be null");
/* 186 */               return;
                    }
/* 5 */             I00IO1oi11O[] i00IO1oi11OArr = (I00IO1oi11O[]) this.I0000Il00O;
/* 7 */             int length = i00IO1oi11OArr.length;
/* 11 */            int i = this.I00000oOI + 1;
/* 20 */            if (this.I00000oIO | (i > length)) {
/* 30 */                i00IO1oi11OArr = new I00IO1oi11O[Math.max(i00IO1oi11OArr.length, (i >> 1) + i)];
/* 38 */                System.arraycopy((I00IO1oi11O[]) this.I0000Il00O, 0, i00IO1oi11OArr, 0, this.I00000oOI);
/* 41 */                this.I0000Il00O = i00IO1oi11OArr;
/* 43 */                this.I00000oIO = false;
                    }
/* 47 */            i00IO1oi11OArr[this.I00000oOI] = i00IO1oi11O;
/* 49 */            this.I00000oOI = i;
                }

                public I00IO1oi11O I0000oI00(int i) {
/* 3 */             if (i < this.I00000oOI) {
/* 9 */                 return ((I00IO1oi11O[]) this.I0000Il00O)[i];
                    }
/* 49 */            throw new ArrayIndexOutOfBoundsException(i + " >= " + this.I00000oOI);
                }

                public O01O0o1iI I0001Ioi1lo() throws Throwable {
                    O01O0o1iI o01ioO1o0i11;
                    Object obj;
/* 3 */             I11l01l i11l01l = (I11l01l) this.I0000Il00O;
/* 5 */             byte bI00IO1oi11O = i11l01l.I00IO1oi11O();
/* 10 */            if (bI00IO1oi11O == 1) {
/* 12 */                return I000OOo1O(true);
                    }
/* 18 */            if (bI00IO1oi11O == 0) {
/* 20 */                return I000OOo1O(false);
                    }
/* 27 */            if (bI00IO1oi11O != 6) {
/* 215 */               if (bI00IO1oi11O == 8) {
/* 217 */                   return I000II();
                        }
/* 232 */               I11l01l.I001IO000(i11l01l, "Cannot read Json element because of unexpected ".concat(iOI0IO0iio0o.I00000oOI(bI00IO1oi11O)), 0, null, 6);
/* 541 */               throw null;
                    }
/* 31 */            int i = this.I00000oOI + 1;
/* 32 */            this.I00000oOI = i;
/* 36 */            if (i == 200) {
/* 40 */                O01o1o0 o01o1o0 = new O01o1o0(this, null);
/* 43 */                Ii0111o ii0111o = Ii1iOioiI.I00000oIO;
/* 47 */                Ii1iOlI ii1iOlI = new Ii1iOlI();
/* 50 */                ii1iOlI.I00iOIl = o01o1o0;
/* 52 */                ii1iOlI.I00iiI = ii1iOlI;
/* 54 */                Ii0111o ii0111o2 = Ii1iOioiI.I00000oIO;
/* 56 */                ii1iOlI.I00iiO = ii0111o2;
                        while (true) {
/* 58 */                    obj = ii1iOlI.I00iiO;
/* 60 */                    IOoil1iiIilo iOoil1iiIilo = ii1iOlI.I00iiI;
/* 62 */                    if (iOoil1iiIilo == null) {
                                break;
                            }
/* 75 */                    if (O0000Ioio00.I0000O(ii0111o2, obj)) {
                                try {
/* 77 */                            O01o1o0 o01o1o02 = ii1iOlI.I00iOIl;
/* 80 */                            OoOOI1100oI0.I0000Il00O(3, o01o1o02);
/* 87 */                            O01o1o0 o01o1o03 = new O01o1o0(o01o1o02.I00iio, iOoil1iiIilo);
/* 90 */                            o01o1o03.I00iiO = ii1iOlI;
/* 94 */                            Object objInvokeSuspend = o01o1o03.invokeSuspend(OoiIlOl1iI.I00000oIO);
/* 100 */                           if (objInvokeSuspend != Ii0111o.I00iOIl) {
/* 102 */                               iOoil1iiIilo.resumeWith(objInvokeSuspend);
                                    }
                                } catch (Throwable th) {
/* 111 */                           iOoil1iiIilo.resumeWith(lIoii1l01l0i.I00000oIO(th));
                                }
                            } else {
/* 115 */                       ii1iOlI.I00iiO = ii0111o2;
/* 117 */                       iOoil1iiIilo.resumeWith(obj);
                            }
                        }
/* 64 */                lIoii1l01l0i.I00000oOI(obj);
/* 67 */                o01ioO1o0i11 = (O01O0o1iI) obj;
                    } else {
/* 121 */               byte bI000oI1ioi = i11l01l.I000oI1ioi((byte) 6);
/* 130 */               if (i11l01l.I00IO1oi11O() == 4) {
/* 209 */                   I11l01l.I001IO000(i11l01l, "Unexpected leading comma", 0, null, 6);
/* 212 */                   throw null;
                        }
/* 134 */               LinkedHashMap linkedHashMap = new LinkedHashMap();
                        while (true) {
/* 142 */                   if (!i11l01l.I000iOII()) {
                                break;
                            }
/* 153 */                   String strI0010o = this.I00000oIO ? i11l01l.I0010o() : i11l01l.I0010I0i();
/* 158 */                   i11l01l.I000oI1ioi((byte) 5);
/* 165 */                   linkedHashMap.put(strI0010o, I0001Ioi1lo());
/* 168 */                   bI000oI1ioi = i11l01l.I000o00OoI0I();
/* 172 */                   if (bI000oI1ioi != 4) {
/* 174 */                       if (bI000oI1ioi != 7) {
/* 179 */                           I11l01l.I001IO000(i11l01l, "Expected end of the object or comma", 0, null, 6);
/* 182 */                           throw null;
                                }
                            }
                        }
/* 183 */               if (bI000oI1ioi == 6) {
/* 185 */                   i11l01l.I000oI1ioi((byte) 7);
                        } else if (bI000oI1ioi == 4) {
/* 203 */                   l0I0OO0.I0000O(i11l01l);
/* 206 */                   throw null;
                        }
/* 193 */               o01ioO1o0i11 = new O01ioO1o0i11(linkedHashMap);
                    }
                    this.I00000oOI--;
/* 202 */           return o01ioO1o0i11;
                }

                public O011oi0l1O I000II() {
/* 3 */             I11l01l i11l01l = (I11l01l) this.I0000Il00O;
/* 5 */             byte bI000o00OoI0I = i11l01l.I000o00OoI0I();
/* 16 */            if (i11l01l.I00IO1oi11O() == 4) {
/* 85 */                I11l01l.I001IO000(i11l01l, "Unexpected leading comma", 0, null, 6);
/* 113 */               throw null;
                    }
/* 20 */            ArrayList arrayList = new ArrayList();
/* 29 */            while (i11l01l.I000iOII()) {
/* 35 */                arrayList.add(I0001Ioi1lo());
/* 38 */                bI000o00OoI0I = i11l01l.I000o00OoI0I();
/* 42 */                if (bI000o00OoI0I != 4) {
/* 48 */                    boolean z = bI000o00OoI0I == 9;
/* 49 */                    int i = i11l01l.I00000oOI;
/* 51 */                    if (!z) {
/* 56 */                        I11l01l.I001IO000(i11l01l, "Expected end of the array or comma", i, null, 4);
/* 59 */                        throw null;
                            }
                        }
                    }
/* 62 */            if (bI000o00OoI0I == 8) {
/* 64 */                i11l01l.I000oI1ioi((byte) 9);
                    } else if (bI000o00OoI0I == 4) {
/* 78 */                l0I0OO0.I0000Il00O(i11l01l, "array");
/* 81 */                throw null;
                    }
/* 72 */            return new O011oi0l1O(arrayList);
                }

                /* JADX WARN: Removed duplicated region for block: B:34:0x00a3  */
                /* JADX WARN: Removed duplicated region for block: B:35:0x00a7  */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public Object I000O01llI0(Ii1iOlI ii1iOlI, I1oI1lil i1oI1lil) throws Throwable {
                    O01o1oI0ii0 o01o1oI0ii0;
                    LinkedHashMap linkedHashMap;
                    Ii1iOlI ii1iOlI2;
                    byte bI000o00OoI0I;
                    I00IOO i00ioo;
/* 3 */             I11l01l i11l01l = (I11l01l) this.I0000Il00O;
/* 7 */             if (i1oI1lil instanceof O01o1oI0ii0) {
/* 10 */                o01o1oI0ii0 = (O01o1oI0ii0) i1oI1lil;
/* 12 */                int i = o01o1oI0ii0.I00ioIO;
/* 18 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 21 */                    o01o1oI0ii0.I00ioIO = i - Integer.MIN_VALUE;
                        } else {
/* 26 */                    o01o1oI0ii0 = new O01o1oI0ii0(this, i1oI1lil);
                        }
                    }
/* 29 */            Object obj = o01o1oI0ii0.I00ilO0;
/* 31 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 33 */            int i2 = o01o1oI0ii0.I00ioIO;
/* 37 */            int i3 = 0;
/* 41 */            if (i2 == 0) {
/* 95 */                lIoii1l01l0i.I00000oOI(obj);
/* 98 */                byte bI000oI1ioi = i11l01l.I000oI1ioi((byte) 6);
/* 106 */               if (i11l01l.I00IO1oi11O() == 4) {
/* 182 */                   I11l01l.I001IO000(i11l01l, "Unexpected leading comma", 0, null, 6);
/* 551 */                   throw null;
                        }
/* 110 */               linkedHashMap = new LinkedHashMap();
/* 113 */               ii1iOlI2 = ii1iOlI;
/* 114 */               bI000o00OoI0I = bI000oI1ioi;
                    } else {
/* 43 */                if (i2 != 1) {
/* 91 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 35 */                    return null;
                        }
/* 45 */                int i4 = o01o1oI0ii0.I00ilI0I1;
/* 47 */                String str = o01o1oI0ii0.I00iio;
/* 49 */                linkedHashMap = o01o1oI0ii0.I00iiO;
/* 51 */                i00ioo = o01o1oI0ii0.I00iiI;
/* 53 */                ii1iOlI2 = o01o1oI0ii0.I00iOIl;
/* 55 */                lIoii1l01l0i.I00000oOI(obj);
/* 60 */                linkedHashMap.put(str, (O01O0o1iI) obj);
/* 67 */                bI000o00OoI0I = ((I11l01l) i00ioo.I0000Il00O).I000o00OoI0I();
/* 71 */                if (bI000o00OoI0I != 4) {
/* 73 */                    if (bI000o00OoI0I != 7) {
/* 82 */                        I11l01l.I001IO000((I11l01l) i00ioo.I0000Il00O, "Expected end of the object or comma", 0, null, 6);
/* 85 */                        throw null;
                            }
/* 160 */                   I11l01l i11l01l2 = (I11l01l) i00ioo.I0000Il00O;
/* 162 */                   if (bI000o00OoI0I != 6) {
/* 164 */                       i11l01l2.I000oI1ioi((byte) 7);
                            } else if (bI000o00OoI0I == 4) {
/* 176 */                       l0I0OO0.I0000O(i11l01l2);
/* 179 */                       throw null;
                            }
/* 172 */                   return new O01ioO1o0i11(linkedHashMap);
                        }
/* 86 */                i3 = i4;
/* 87 */                this = i00ioo;
                    }
/* 117 */           I11l01l i11l01l3 = (I11l01l) this.I0000Il00O;
/* 123 */           if (!i11l01l3.I000iOII()) {
/* 157 */               i00ioo = this;
/* 160 */               I11l01l i11l01l22 = (I11l01l) i00ioo.I0000Il00O;
/* 162 */               if (bI000o00OoI0I != 6) {
                        }
/* 172 */               return new O01ioO1o0i11(linkedHashMap);
                    }
/* 134 */           String strI0010o = this.I00000oIO ? i11l01l3.I0010o() : i11l01l3.I0010I0i();
/* 139 */           i11l01l3.I000oI1ioi((byte) 5);
/* 142 */           o01o1oI0ii0.I00iOIl = ii1iOlI2;
/* 144 */           o01o1oI0ii0.I00iiI = this;
/* 146 */           o01o1oI0ii0.I00iiO = linkedHashMap;
/* 148 */           o01o1oI0ii0.I00iio = strI0010o;
/* 150 */           o01o1oI0ii0.I00ilI0I1 = i3;
/* 152 */           o01o1oI0ii0.I00ioIO = 1;
/* 154 */           ii1iOlI2.I00iiI = o01o1oI0ii0;
/* 156 */           return ii0111o;
                }

                public O01lO1iO I000OOo1O(boolean z) {
/* 3 */             I11l01l i11l01l = (I11l01l) this.I0000Il00O;
/* 17 */            String strI0010o = (this.I00000oIO || !z) ? i11l01l.I0010o() : i11l01l.I0010I0i();
                    return (z || !O0000Ioio00.I0000O(strI0010o, "null")) ? new O01i0Iiil(strI0010o, z, null) : O01iI0i0.INSTANCE;
                }

                public I00IO1oi11O[] I000OiO() {
/* 1 */             int i = this.I00000oOI;
/* 3 */             if (i == 0) {
/* 5 */                 return I0000O;
                    }
/* 10 */            I00IO1oi11O[] i00IO1oi11OArr = (I00IO1oi11O[]) this.I0000Il00O;
/* 13 */            if (i00IO1oi11OArr.length == i) {
/* 16 */                this.I00000oIO = true;
/* 18 */                return i00IO1oi11OArr;
                    }
/* 19 */            I00IO1oi11O[] i00IO1oi11OArr2 = new I00IO1oi11O[i];
/* 22 */            System.arraycopy(i00IO1oi11OArr, 0, i00IO1oi11OArr2, 0, i);
/* 29 */            return i00IO1oi11OArr2;
                }

                public void I000l1(Object obj) {
/* 1 */             obj.getClass();
/* 6 */             int i = this.I00000oOI + 1;
/* 10 */            Object[] objArrCopyOf = (Object[]) this.I0000Il00O;
/* 12 */            int length = objArrCopyOf.length;
/* 14 */            if (length < i) {
/* 20 */                objArrCopyOf = Arrays.copyOf(objArrCopyOf, I000iOII(length, i));
/* 24 */                this.I0000Il00O = objArrCopyOf;
/* 26 */                this.I00000oIO = false;
                    } else if (this.I00000oIO) {
/* 38 */                objArrCopyOf = (Object[]) objArrCopyOf.clone();
/* 40 */                this.I0000Il00O = objArrCopyOf;
/* 42 */                this.I00000oIO = false;
                    }
/* 44 */            int i2 = this.I00000oOI;
/* 48 */            this.I00000oOI = i2 + 1;
/* 50 */            objArrCopyOf[i2] = obj;
                }

/* 22 */        public I00IOO(int i) {
                    if (i < 0) {
                        I000II.I000iOII("'initialCapacity' must not be negative");
                        throw null;
                    }
                    this.I0000Il00O = i == 0 ? I0000O : new I00IO1oi11O[i];
                    this.I00000oOI = 0;
                    this.I00000oIO = false;
                }

/* 23 */        public I00IOO(Ol0O0iI0l0O ol0O0iI0l0O, int i, boolean z) {
                    this.I0000Il00O = ol0O0iI0l0O;
                    this.I00000oOI = i;
                    this.I00000oIO = z;
                }
            }
