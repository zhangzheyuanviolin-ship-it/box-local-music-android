            package p000;

            import java.lang.invoke.VarHandle;
            
/* 13 */    public final class OlIOiI1iI1 implements IlIoO1ilo1 {
                public final float I00000oIO;
                public final float I00000oOI;
                public final Object I0000Il00O;

                public OlIOiI1iI1(Object obj, int i) {
/* 11 */            this(1.0f, 1500.0f, (i & 4) != 0 ? null : obj);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override
                public final O1OIll00i I00000oIO(OoIoOiiO1 ooIoOiiO1) {
                    I11101ii1 i11101ii1;
/* 3 */             Object obj = this.I0000Il00O;
/* 15 */            I110ooool i110ooool = obj == null ? null : (I110ooool) ooIoOiiO1.I00000oIO.invoke(obj);
/* 17 */            int[] iArr = Ooo1lo1l.I00000oIO;
/* 19 */            float f = this.I00000oIO;
/* 21 */            float f2 = this.I00000oOI;
/* 23 */            if (i110ooool == null && f == 1.0f && f2 == 1500.0f) {
/* 38 */                i11101ii1 = IiI1ilo1i.I00iOIl;
                    } else {
/* 41 */                Object[] objArr = 0;
/* 42 */                if (i110ooool != null) {
/* 46 */                    iiOlilo0IIIl iiolilo0iiil = new iiOlilo0IIIl();
/* 49 */                    int iI00000oOI = i110ooool.I00000oOI();
/* 53 */                    IlOOoI0ooOO[] ilOOoI0ooOOArr = new IlOOoI0ooOO[iI00000oOI];
/* 55 */                    for (int i = 0; i < iI00000oOI; i++) {
/* 66 */                        ilOOoI0ooOOArr[i] = new IlOOoI0ooOO(f, f2, i110ooool.I00000oIO(i));
                            }
/* 71 */                    iiolilo0iiil.I00iOIl = ilOOoI0ooOOArr;
/* 73 */                    VarHandle.storeStoreFence();
/* 76 */                    i11101ii1 = iiolilo0iiil;
                        } else {
/* 82 */                    Oi1ol0llI oi1ol0llI = new Oi1ol0llI(19, (boolean) (objArr == true ? 1 : 0));
/* 90 */                    oi1ol0llI.I00iiI = new IlOOoI0ooOO(f, f2);
/* 92 */                    VarHandle.storeStoreFence();
/* 95 */                    i11101ii1 = oi1ol0llI;
                        }
                    }
/* 98 */            O1OIll00i o1OIll00i = new O1OIll00i(26);
/* 106 */           o1OIll00i.I00iiI = new OillOo0(i11101ii1);
/* 108 */           VarHandle.storeStoreFence();
/* 168 */           return o1OIll00i;
                }

                public final boolean equals(Object obj) {
/* 4 */             if (obj instanceof OlIOiI1iI1) {
/* 6 */                 OlIOiI1iI1 olIOiI1iI1 = (OlIOiI1iI1) obj;
/* 14 */                if (olIOiI1iI1.I00000oIO == this.I00000oIO && olIOiI1iI1.I00000oOI == this.I00000oOI && O0000Ioio00.I0000O(olIOiI1iI1.I0000Il00O, this.I0000Il00O)) {
/* 34 */                    return true;
                        }
                    }
/* 3 */             return false;
                }

                public final int hashCode() {
/* 1 */             Object obj = this.I0000Il00O;
/* 26 */            return Float.hashCode(this.I00000oOI) + OooioIOo1.I0000O((obj != null ? obj.hashCode() : 0) * 31, 31, this.I00000oIO);
                }

/* 14 */        public OlIOiI1iI1(float f, float f2, Object obj) {
/* 16 */            this.I00000oIO = f;
/* 17 */            this.I00000oOI = f2;
/* 18 */            this.I0000Il00O = obj;
                }
            }
