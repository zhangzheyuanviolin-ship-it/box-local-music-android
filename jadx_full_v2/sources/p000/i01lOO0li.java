            package p000;

            import java.util.Enumeration;
            import java.util.Hashtable;
            
            public final class i01lOO0li extends I00IoO0 implements I00IO1 {
                public static final I1liloOl I00ilO0 = I1liloOl.I00000oOI;
                public boolean I00iOIl;
                public int I00iiI;
                public final II1OO0Iii I00iiO = I00ilO0;
                public final OOiliIii[] I00iio;
                public final Ii0ol0ii01I I00ilI0I1;

                public i01lOO0li(I00OOll1 i00OOll1) {
                    Ii0ol0ii01I ii0ol0ii01I;
/* 14 */            this.I00iio = new OOiliIii[i00OOll1.size()];
/* 16 */            Enumeration enumerationI00II0Ol1O0l = i00OOll1.I00II0Ol1O0l();
/* 21 */            int i = 0;
/* 22 */            boolean z = true;
/* 23 */            int i2 = 0;
                    while (true) {
/* 28 */                OOiliIii oOiliIii = null;
/* 29 */                if (!enumerationI00II0Ol1O0l.hasMoreElements()) {
                            break;
                        }
/* 31 */                Object objNextElement = enumerationI00II0Ol1O0l.nextElement();
/* 37 */                if (objNextElement instanceof OOiliIii) {
/* 40 */                    oOiliIii = (OOiliIii) objNextElement;
                        } else if (objNextElement != null) {
/* 47 */                    I00OilO00Il i00OilO00IlI001iOo1i0O = I00OilO00Il.I001iOo1i0O(objNextElement);
/* 51 */                    oOiliIii = new OOiliIii();
/* 54 */                    oOiliIii.I00iOIl = i00OilO00IlI001iOo1i0O;
                        }
/* 61 */                z &= oOiliIii == objNextElement;
/* 66 */                this.I00iio[i2] = oOiliIii;
/* 64 */                i2++;
                    }
/* 70 */            if (!z) {
/* 83 */                OOiliIii[] oOiliIiiArr = this.I00iio;
/* 85 */                ii0ol0ii01I = new Ii0ol0ii01I(i);
/* 88 */                if (oOiliIiiArr != null) {
/* 90 */                    int length = oOiliIiiArr.length;
/* 91 */                    while (i < length) {
/* 95 */                        if (oOiliIiiArr[i] != null) {
/* 97 */                            i++;
                                }
                            }
/* 114 */                   ii0ol0ii01I.I00iOIl = oOiliIiiArr.length < 1 ? I00IOO.I0000O : (I00IO1oi11O[]) oOiliIiiArr.clone();
/* 117 */                   ii0ol0ii01I.I00iio = -1;
                        }
/* 122 */               IOOlIIilOl0.I000II("'elements' cannot be null, or contain null");
/* 186 */               throw null;
                    }
/* 76 */            ii0ol0ii01I = (Ii0ol0ii01I) i00OOll1.I001IIilI0O();
/* 78 */            this.I00ilI0I1 = ii0ol0ii01I;
                }

                public static i01lOO0li I000o00OoI0I(Object obj) {
/* 3 */             if (obj instanceof i01lOO0li) {
/* 5 */                 return (i01lOO0li) obj;
                    }
/* 8 */             if (obj != null) {
/* 16 */                return new i01lOO0li(I00OOll1.I001lllioOl(obj));
                    }
/* 20 */            return null;
                }

                @Override
                public final I00OIO1 I0000O() {
/* 1 */             return this.I00ilI0I1;
                }

                @Override
                public final boolean equals(Object obj) {
/* 1 */             if (obj == this) {
/* 28 */                return true;
                    }
/* 6 */             if (!(obj instanceof i01lOO0li) && !(obj instanceof I00OOll1)) {
/* 55 */                return false;
                    }
/* 26 */            if (this.I00ilI0I1.I0010o(((I00IO1oi11O) obj).I0000O())) {
/* 28 */                return true;
                    }
                    try {
/* 30 */                II1OO0Iii iI1OO0Iii = this.I00iiO;
/* 44 */                i01lOO0li i01loo0li = new i01lOO0li(I00OOll1.I001lllioOl(((I00IO1oi11O) obj).I0000O()));
/* 47 */                iI1OO0Iii.getClass();
/* 50 */                return II1OO0Iii.I00000oIO(this, i01loo0li);
                    } catch (Exception unused) {
/* 55 */                return false;
                    }
                }

                @Override
                public final int hashCode() {
/* 3 */             if (this.I00iOIl) {
/* 5 */                 return this.I00iiI;
                    }
/* 9 */             this.I00iOIl = true;
/* 13 */            this.I00iiO.getClass();
/* 22 */            OOiliIii[] oOiliIiiArr = (OOiliIii[]) this.I00iio.clone();
/* 26 */            int iHashCode = 0;
/* 28 */            for (int i = 0; i != oOiliIiiArr.length; i++) {
/* 30 */                OOiliIii oOiliIii = oOiliIiiArr[i];
/* 37 */                if (oOiliIii.I00iOIl.I00iOIl.length > 1) {
/* 39 */                    I1i000Io[] i1i000IoArrI000oI1ioi = oOiliIii.I000oI1ioi();
/* 45 */                    for (int i2 = 0; i2 != i1i000IoArrI000oI1ioi.length; i2++) {
/* 70 */                        iHashCode = (iHashCode ^ i1i000IoArrI000oI1ioi[i2].I00iOIl.I00iOIl.hashCode()) ^ io0i0iOO1iI.I00000oOI(i1i000IoArrI000oI1ioi[i2].I00iiI).hashCode();
                            }
                        } else {
/* 103 */                   iHashCode = (iHashCode ^ oOiliIii.I000o00OoI0I().I00iOIl.I00iOIl.hashCode()) ^ io0i0iOO1iI.I00000oOI(oOiliIiiArr[i].I000o00OoI0I().I00iiI).hashCode();
                        }
                    }
/* 107 */           this.I00iiI = iHashCode;
/* 113 */           return iHashCode;
                }

                public final String toString() {
/* 3 */             I1liloOl i1liloOl = (I1liloOl) this.I00iiO;
/* 5 */             i1liloOl.getClass();
/* 10 */            StringBuffer stringBuffer = new StringBuffer();
/* 23 */            boolean z = true;
/* 26 */            for (OOiliIii oOiliIii : (OOiliIii[]) this.I00iio.clone()) {
/* 28 */                if (z) {
/* 30 */                    z = false;
                        } else {
/* 34 */                    stringBuffer.append(',');
                        }
/* 39 */                Hashtable hashtable = i1liloOl.I00000oIO;
/* 46 */                if (oOiliIii.I00iOIl.I00iOIl.length > 1) {
/* 48 */                    I1i000Io[] i1i000IoArrI000oI1ioi = oOiliIii.I000oI1ioi();
/* 52 */                    boolean z2 = true;
/* 55 */                    for (int i = 0; i != i1i000IoArrI000oI1ioi.length; i++) {
/* 57 */                        if (z2) {
/* 59 */                            z2 = false;
                                } else {
/* 63 */                            stringBuffer.append('+');
                                }
/* 68 */                        io0i0iOO1iI.I00000oIO(stringBuffer, i1i000IoArrI000oI1ioi[i], hashtable);
                            }
                        } else if (oOiliIii.I000o00OoI0I() != null) {
/* 84 */                    io0i0iOO1iI.I00000oIO(stringBuffer, oOiliIii.I000o00OoI0I(), hashtable);
                        }
                    }
/* 90 */            return stringBuffer.toString();
                }
            }
