            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class OiI111I implements OioOIi1o0I, Iooo0ilooO0 {
                public final Ii0010ol0 I00000oIO;
                public final Ii0010ol0 I00000oOI;
                public final Ii0010ol0 I0000Il00O;
                public final Ii0010ol0 I0000O;

                public OiI111I(Ii0010ol0 ii0010ol0, Ii0010ol0 ii0010ol02, Ii0010ol0 ii0010ol03, Ii0010ol0 ii0010ol04) {
/* 4 */             this.I00000oIO = ii0010ol0;
/* 6 */             this.I00000oOI = ii0010ol02;
/* 8 */             this.I0000Il00O = ii0010ol03;
/* 10 */            this.I0000O = ii0010ol04;
                }

                public static OiI111I I0000Il00O(OiI111I oiI111I, Ii0010ol0 ii0010ol0, Ii0010ol0 ii0010ol02, Ii0010ol0 ii0010ol03, Ii0010ol0 ii0010ol04, int i) {
/* 3 */             if ((i & 1) != 0) {
/* 5 */                 ii0010ol0 = oiI111I.I00000oIO;
                    }
/* 9 */             if ((i & 2) != 0) {
/* 11 */                ii0010ol02 = oiI111I.I00000oOI;
                    }
/* 15 */            if ((i & 4) != 0) {
/* 17 */                ii0010ol03 = oiI111I.I0000Il00O;
                    }
/* 21 */            if ((i & 8) != 0) {
/* 23 */                ii0010ol04 = oiI111I.I0000O;
                    }
/* 25 */            oiI111I.getClass();
/* 30 */            return new OiI111I(ii0010ol0, ii0010ol02, ii0010ol03, ii0010ol04);
                }

                @Override
                public final l1lOoiII1l I00000oIO(long j, O0iOOoiioO o0iOOoiioO, IiIooOOOI iiIooOOOI) {
/* 11 */            float fI00000oIO = this.I00000oIO.I00000oIO(j, iiIooOOOI);
/* 17 */            float fI00000oIO2 = this.I00000oOI.I00000oIO(j, iiIooOOOI);
/* 23 */            float fI00000oIO3 = this.I0000Il00O.I00000oIO(j, iiIooOOOI);
/* 29 */            float fI00000oIO4 = this.I0000O.I00000oIO(j, iiIooOOOI);
/* 33 */            float fI0000O = Ol0i1I.I0000O(j);
/* 37 */            float f = fI00000oIO + fI00000oIO4;
/* 41 */            if (f > fI0000O) {
/* 43 */                float f2 = fI0000O / f;
/* 45 */                fI00000oIO *= f2;
/* 46 */                fI00000oIO4 *= f2;
                    }
/* 47 */            float f3 = fI00000oIO2 + fI00000oIO3;
/* 51 */            if (f3 > fI0000O) {
/* 53 */                float f4 = fI0000O / f3;
/* 54 */                fI00000oIO2 *= f4;
/* 55 */                fI00000oIO3 *= f4;
                    }
/* 59 */            if (fI00000oIO < 0.0f || fI00000oIO2 < 0.0f || fI00000oIO3 < 0.0f || fI00000oIO4 < 0.0f) {
/* 80 */                StringBuilder sbI00100l0 = IlIi0I0.I00100l0("Corner size in Px can't be negative(topStart = ", fI00000oIO, ", topEnd = ", fI00000oIO2, ", bottomEnd = ");
/* 84 */                sbI00100l0.append(fI00000oIO3);
/* 89 */                sbI00100l0.append(", bottomStart = ");
/* 92 */                sbI00100l0.append(fI00000oIO4);
/* 97 */                sbI00100l0.append(")!");
/* 104 */               Ioll0IliO1l.I00000oIO(sbI00100l0.toString());
                    }
/* 115 */           if (fI00000oIO + fI00000oIO2 + fI00000oIO3 + fI00000oIO4 == 0.0f) {
/* 123 */               return new OIioiIl(lIl0looO.I00000oIO(0L, j));
                    }
/* 129 */           OOo0IO oOo0IOI00000oIO = lIl0looO.I00000oIO(0L, j);
/* 133 */           O0iOOoiioO o0iOOoiioO2 = O0iOOoiioO.I00iOIl;
/* 139 */           float f5 = o0iOOoiioO == o0iOOoiioO2 ? fI00000oIO : fI00000oIO2;
/* 159 */           long jFloatToRawIntBits = (Float.floatToRawIntBits(f5) & 4294967295L) | (Float.floatToRawIntBits(f5) << 32);
/* 160 */           if (o0iOOoiioO == o0iOOoiioO2) {
/* 162 */               fI00000oIO = fI00000oIO2;
                    }
/* 175 */           long jFloatToRawIntBits2 = (Float.floatToRawIntBits(fI00000oIO) & 4294967295L) | (Float.floatToRawIntBits(fI00000oIO) << 32);
/* 180 */           float f6 = o0iOOoiioO == o0iOOoiioO2 ? fI00000oIO3 : fI00000oIO4;
/* 196 */           long jFloatToRawIntBits3 = (Float.floatToRawIntBits(f6) << 32) | (Float.floatToRawIntBits(f6) & 4294967295L);
/* 198 */           if (o0iOOoiioO != o0iOOoiioO2) {
/* 201 */               fI00000oIO4 = fI00000oIO3;
                    }
/* 223 */           return new OIiolOlo1iI(lIooiiO1i.I00000oIO(oOo0IOI00000oIO, jFloatToRawIntBits, jFloatToRawIntBits2, jFloatToRawIntBits3, (Float.floatToRawIntBits(fI00000oIO4) << 32) | (Float.floatToRawIntBits(fI00000oIO4) & 4294967295L)));
                }

                @Override
                public final Object I00000oOI(Object obj, float f) {
/* 7 */             if (O0000Ioio00.I0000O(obj, iO0ioilo.I00000oIO) || obj == null) {
/* 11 */                OiI111I oiI111I = OiI11O1i1.I00000oIO;
/* 15 */                OOiiOo oOiiOo = new OOiiOo();
/* 18 */                VarHandle.storeStoreFence();
/* 23 */                obj = new OiI111I(oOiiOo, oOiiOo, oOiiOo, oOiiOo);
                    }
/* 29 */            if (!(obj instanceof OiI111I)) {
/* 73 */                return null;
                    }
/* 31 */            OiI111I oiI111I2 = (OiI111I) obj;
/* 33 */            OiI111I oiI111I3 = OiI11O1i1.I00000oIO;
/* 69 */            return new OiI111I(OiI11O1i1.I0000O(this.I00000oIO, oiI111I2.I00000oIO, f), OiI11O1i1.I0000O(this.I00000oOI, oiI111I2.I00000oOI, f), OiI11O1i1.I0000O(this.I0000Il00O, oiI111I2.I0000Il00O, f), OiI11O1i1.I0000O(this.I0000O, oiI111I2.I0000O, f));
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof OiI111I)) {
/* 7 */                 return false;
                    }
/* 11 */            OiI111I oiI111I = (OiI111I) obj;
                    return O0000Ioio00.I0000O(this.I00000oIO, oiI111I.I00000oIO) && O0000Ioio00.I0000O(this.I00000oOI, oiI111I.I00000oOI) && O0000Ioio00.I0000O(this.I0000Il00O, oiI111I.I0000Il00O) && O0000Ioio00.I0000O(this.I0000O, oiI111I.I0000O);
                }

                public final int hashCode() {
/* 33 */            return this.I0000O.hashCode() + ((this.I0000Il00O.hashCode() + ((this.I00000oOI.hashCode() + (this.I00000oIO.hashCode() * 31)) * 31)) * 31);
                }

                public final String toString() {
/* 48 */            return "RoundedCornerShape(topStart = " + this.I00000oIO + ", topEnd = " + this.I00000oOI + ", bottomEnd = " + this.I0000Il00O + ", bottomStart = " + this.I0000O + ")";
                }
            }
