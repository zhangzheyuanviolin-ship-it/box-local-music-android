            package p000;
            
            public final class IiI11O11oO implements OiOiliiO {
                public IiI11iIOlOo1 I00000oIO;

                @Override
                public final float I00000oIO(float f) {
/* 1 */             IiI11iIOlOo1 iiI11iIOlOo1 = this.I00000oIO;
/* 8 */             if (Float.isNaN(f)) {
/* 7 */                 return 0.0f;
                    }
/* 23 */            float fFloatValue = ((Number) iiI11iIOlOo1.I00000oIO.invoke(Float.valueOf(f))).floatValue();
/* 42 */            iiI11iIOlOo1.I0000oI00.setValue(Boolean.valueOf(fFloatValue > 0.0f));
/* 56 */            iiI11iIOlOo1.I0001Ioi1lo.setValue(Boolean.valueOf(fFloatValue < 0.0f));
/* 77 */            return fFloatValue;
                }
            }
