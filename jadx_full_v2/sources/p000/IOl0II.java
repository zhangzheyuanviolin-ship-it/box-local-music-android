            package p000;
            
            public final class IOl0II extends Oi10IOIi implements IlliIl1l11O {
                public int I00iiI;
                public int I00iiO;
                public int I00iio;
                public int I00ilI0I1;
                public Object I00ilO0;
                public final IOl0IOiI0 I00io1l;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public IOl0II(IOl0IOiI0 iOl0IOiI0, IOoil1iiIilo iOoil1iiIilo) {
/* 4 */             super(2, iOoil1iiIilo);
/* 1 */             this.I00io1l = iOl0IOiI0;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 5 */             IOl0II iOl0II = new IOl0II(this.I00io1l, iOoil1iiIilo);
/* 8 */             iOl0II.I00ilO0 = obj;
/* 37 */            return iOl0II;
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
/* 13 */            return ((IOl0II) create((OilO111) obj, (IOoil1iiIilo) obj2)).invokeSuspend(OoiIlOl1iI.I00000oIO);
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
                    OilO111 oilO111;
                    int i;
                    int i2;
                    int i3;
                    String strI000l1;
                    int i4;
                    int i5;
                    String str;
/* 1 */             IOl0IOiI0 iOl0IOiI0 = this.I00io1l;
/* 3 */             OI0oiiIO0 oI0oiiIO0 = iOl0IOiI0.I00iOIl;
/* 5 */             OI0l1iiooO oI0l1iiooO = iOl0IOiI0.I00iiO;
/* 7 */             Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 9 */             int i6 = this.I00ilI0I1;
/* 12 */            if (i6 == 0) {
/* 37 */                lIoii1l01l0i.I00000oOI(obj);
/* 43 */                oilO111 = (OilO111) this.I00ilO0;
/* 45 */                i = 0;
/* 46 */                i2 = 0;
/* 47 */                i3 = 0;
                    } else {
/* 14 */                if (i6 != 1) {
/* 32 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 35 */                    return null;
                        }
/* 16 */                i = this.I00iio;
/* 18 */                i2 = this.I00iiO;
/* 20 */                i3 = this.I00iiI;
/* 24 */                oilO111 = (OilO111) this.I00ilO0;
/* 26 */                lIoii1l01l0i.I00000oOI(obj);
                    }
/* 58 */            if (i3 >= Math.min(iOl0IOiI0.I00iio + 10, oI0l1iiooO.I00000oOI)) {
/* 322 */               return OoiIlOl1iI.I00000oIO;
                    }
/* 60 */            int i7 = i3 + 1;
/* 62 */            int iI0000Il00O = oI0l1iiooO.I0000Il00O(i3);
                    switch (iI0000Il00O) {
                        case 0:
/* 286 */                   strI000l1 = "up";
                            break;
                        case 1:
/* 265 */                   Object objI000II = oI0oiiIO0.I000II(i2);
/* 263 */                   i2++;
/* 279 */                   strI000l1 = "down " + objI000II;
                            break;
                        case 2:
/* 257 */                   strI000l1 = IIl001iO0Io.I000l1(oI0l1iiooO.I0000Il00O(i7), oI0l1iiooO.I0000Il00O(i3 + 2), "remove ", " ");
/* 249 */                   i7 = i3 + 3;
                            break;
                        case 3:
/* 212 */                   int iI0000Il00O2 = oI0l1iiooO.I0000Il00O(i7);
/* 218 */                   int iI0000Il00O3 = oI0l1iiooO.I0000Il00O(i3 + 2);
/* 224 */                   int iI0000Il00O4 = oI0l1iiooO.I0000Il00O(i3 + 3);
/* 230 */                   StringBuilder sbI0010I0i = IIl001iO0Io.I0010I0i("move ", iI0000Il00O2, " ", iI0000Il00O3, " ");
/* 234 */                   sbI0010I0i.append(iI0000Il00O4);
/* 237 */                   strI000l1 = sbI0010I0i.toString();
/* 222 */                   i7 = i3 + 4;
                            break;
                        case 4:
/* 207 */                   strI000l1 = "clear";
                            break;
                        case 5:
/* 174 */                   i4 = i3 + 2;
/* 176 */                   int iI0000Il00O5 = oI0l1iiooO.I0000Il00O(i7);
/* 180 */                   i5 = i2 + 1;
/* 202 */                   str = "insertBottomUp " + iI0000Il00O5 + " " + oI0oiiIO0.I000II(i2);
/* 168 */                   int i8 = i4;
/* 169 */                   strI000l1 = str;
/* 170 */                   i7 = i8;
/* 171 */                   i2 = i5;
                            break;
                        case 6:
/* 136 */                   i4 = i3 + 2;
/* 138 */                   int iI0000Il00O6 = oI0l1iiooO.I0000Il00O(i7);
/* 142 */                   i5 = i2 + 1;
/* 164 */                   str = "insertTopDown " + iI0000Il00O6 + " " + oI0oiiIO0.I000II(i2);
/* 168 */                   int i82 = i4;
/* 169 */                   strI000l1 = str;
/* 170 */                   i7 = i82;
/* 171 */                   i2 = i5;
                            break;
                        case 7:
/* 108 */                   Object objI000II2 = oI0oiiIO0.I000II(i2);
/* 113 */                   OoOOI1100oI0.I0000Il00O(2, objI000II2);
/* 118 */                   i2 += 2;
/* 130 */                   strI000l1 = "apply " + ((IlliIl1l11O) objI000II2);
                            break;
                        case 8:
/* 101 */                   strI000l1 = "reuse " + iOl0IOiI0.I00iiI.I000II(i);
/* 85 */                    i++;
                            break;
                        case 9:
/* 79 */                    strI000l1 = "recompose pending";
                            break;
                        default:
/* 73 */                    strI000l1 = Oi010OO0.I000oI1ioi(iI0000Il00O, "unknown op: ");
                            break;
                    }
/* 308 */           this.I00ilO0 = oilO111;
/* 310 */           this.I00iiI = i7;
/* 312 */           this.I00iiO = i2;
/* 314 */           this.I00iio = i;
/* 316 */           this.I00ilI0I1 = 1;
/* 318 */           oilO111.I00000oOI(this, i3 + ": " + strI000l1);
/* 321 */           return ii0111o;
                }
            }
