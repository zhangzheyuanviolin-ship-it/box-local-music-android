            package p000;

            import java.util.ArrayList;
            import java.util.List;
            
            public final class O1Il1i0oOooo extends O1IlII1o1O0i {
                public final String I000OOo1O;
                public final O1IlIoIOOIi I000OiO;
                public final List I000iOII;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public O1Il1i0oOooo(String str, OI1IO0IiiI oI1IO0IiiI, O1IlIoIOOIi o1IlIoIOOIi, ArrayList arrayList) {
/* 5 */             super(oI1IO0IiiI, 23);
/* 1 */             O1Ill0ioO10 o1Ill0ioO10 = o1IlIoIOOIi.I00000oOI;
/* 8 */             this.I000OOo1O = str;
/* 10 */            this.I000OiO = o1IlIoIOOIi;
/* 12 */            this.I000iOII = arrayList;
/* 14 */            ArrayList arrayListI0000Il00O = o1IlIoIOOIi.I0000Il00O(str);
/* 18 */            int size = arrayListI0000Il00O.size();
/* 22 */            II1i0i0ilO[] iI1i0i0ilOArr = new II1i0i0ilO[size];
/* 24 */            Float[] fArr = new Float[size];
/* 29 */            for (int i = 0; i < size; i++) {
/* 35 */                fArr[i] = Float.valueOf(0.0f);
                    }
/* 44 */            o1Ill0ioO10.I0000oI00(IOOi0Ool1i.I00iIi0i1o(arrayListI0000Il00O), iI1i0i0ilOArr, size);
/* 51 */            o1Ill0ioO10.I0000O(IOOi0Ool1i.I00iIi0i1o(arrayListI0000Il00O), fArr, size);
/* 54 */            this.I0000Il00O = 0.0f;
/* 56 */            for (int i2 = 0; i2 < size; i2++) {
/* 58 */                II1i0i0ilO iI1i0i0ilO = iI1i0i0ilOArr[i2];
/* 60 */                if (iI1i0i0ilO != null) {
/* 65 */                    float fMax = Math.max(0.0f, iI1i0i0ilO.I0000oI00 - 0.0f);
/* 73 */                    float fMax2 = Math.max(0.0f, 0.0f - iI1i0i0ilO.I0000Il00O);
/* 81 */                    if (fMax > this.I00000oIO) {
/* 83 */                        this.I00000oIO = fMax;
                            }
/* 89 */                    if (fMax2 > this.I00000oOI) {
/* 91 */                        this.I00000oOI = fMax2;
                            }
/* 102 */                   this.I0000Il00O = fArr[i2].floatValue() + this.I0000Il00O;
                        }
                    }
                }

                @Override
                public final void I00000oOI(IIolOo iIolOo) {
                    float fFloatValue;
/* 1 */             I0oiil10Ili i0oiil10IliI00000oIO = lI0ol111l.I00000oIO();
/* 5 */             i0oiil10IliI00000oIO.I00100o1O0lo();
/* 10 */            i0oiil10IliI00000oIO.I0010o(this.I000II);
/* 15 */            O1IlIoIOOIi o1IlIoIOOIi = this.I000OiO;
/* 19 */            IIOOoll iIOOoll = new IIOOoll(o1IlIoIOOIi.I00000oOI);
/* 24 */            ArrayList arrayListI0000Il00O = o1IlIoIOOIi.I0000Il00O(this.I000OOo1O);
/* 28 */            int size = arrayListI0000Il00O.size();
/* 32 */            Float[] fArr = new Float[size];
/* 35 */            int i = 0;
                    while (true) {
/* 36 */                fFloatValue = 0.0f;
/* 37 */                if (i >= size) {
                            break;
                        }
/* 43 */                fArr[i] = Float.valueOf(0.0f);
/* 45 */                i++;
                    }
/* 50 */            o1IlIoIOOIi.I00000oOI.I0000O(arrayListI0000Il00O, fArr, size);
                    try {
/* 53 */                iIolOo.I000II();
/* 56 */                IIOl10ol0 iIOl10ol0 = this.I0001Ioi1lo;
/* 62 */                iIolOo.I000o00OoI0I(iIOl10ol0.I00000oIO, iIOl10ol0.I00000oOI);
/* 69 */                iIolOo.I00000oIO(1.0f, -1.0f);
/* 72 */                for (int i2 = 0; i2 < size; i2++) {
/* 84 */                    iIOOoll.I00Io1lO(iIolOo, i0oiil10IliI00000oIO, ((Number) arrayListI0000Il00O.get(i2)).intValue(), fFloatValue);
/* 93 */                    fFloatValue += fArr[i2].floatValue();
                        }
/* 101 */               i0oiil10IliI00000oIO.I0010o(IOOiio0i.I000II);
/* 104 */               iIolOo.I00100l0();
                    } catch (Throwable th) {
/* 108 */               iIolOo.I00100l0();
/* 186 */               throw th;
                    }
                }
            }
