            package p000;

            import android.content.Context;
            import android.widget.EdgeEffect;
            
            public final class IioO1oi1li {
                public Context I00000oIO;
                public int I00000oOI;
                public long I0000Il00O;
                public EdgeEffect I0000O;
                public EdgeEffect I0000oI00;
                public EdgeEffect I0001Ioi1lo;
                public EdgeEffect I000II;
                public EdgeEffect I000O01llI0;
                public EdgeEffect I000OOo1O;
                public EdgeEffect I000OiO;
                public EdgeEffect I000iOII;

                public static boolean I0001Ioi1lo(EdgeEffect edgeEffect) {
/* 1 */             if (edgeEffect == null) {
/* 3 */                 return false;
                    }
/* 9 */             return !edgeEffect.isFinished();
                }

                public static boolean I000II(EdgeEffect edgeEffect) {
                    float distance;
/* 2 */             if (edgeEffect == null) {
/* 1 */                 return false;
                    }
                    try {
/* 6 */                 distance = edgeEffect.getDistance();
                    } catch (Throwable unused) {
/* 11 */                distance = 0.0f;
                    }
/* 18 */            return !(distance == 0.0f);
                }

                public final EdgeEffect I00000oIO(OIilII oIilII) {
                    EdgeEffect edgeEffect;
/* 1 */             Context context = this.I00000oIO;
                    try {
/* 6 */                 edgeEffect = new EdgeEffect(context, null);
                    } catch (Throwable unused) {
/* 12 */                edgeEffect = new EdgeEffect(context);
                    }
/* 17 */            edgeEffect.setColor(this.I00000oOI);
/* 28 */            if (!IooOl0ol01.I0000Il00O(this.I0000Il00O, 0L)) {
/* 30 */                OIilII oIilII2 = OIilII.I00iOIl;
/* 32 */                long j = this.I0000Il00O;
/* 41 */                if (oIilII == oIilII2) {
/* 48 */                    edgeEffect.setSize((int) (j >> 32), (int) (j & 4294967295L));
                        } else {
/* 56 */                    edgeEffect.setSize((int) (4294967295L & j), (int) (j >> 32));
                        }
                    }
/* 77 */            return edgeEffect;
                }

                public final EdgeEffect I00000oOI() {
/* 1 */             EdgeEffect edgeEffect = this.I0000oI00;
/* 3 */             if (edgeEffect != null) {
/* 20 */                return edgeEffect;
                    }
/* 7 */             EdgeEffect edgeEffectI00000oIO = I00000oIO(OIilII.I00iOIl);
/* 11 */            this.I0000oI00 = edgeEffectI00000oIO;
/* 20 */            return edgeEffectI00000oIO;
                }

                public final EdgeEffect I0000Il00O() {
/* 1 */             EdgeEffect edgeEffect = this.I0001Ioi1lo;
/* 3 */             if (edgeEffect != null) {
/* 20 */                return edgeEffect;
                    }
/* 7 */             EdgeEffect edgeEffectI00000oIO = I00000oIO(OIilII.I00iiI);
/* 11 */            this.I0001Ioi1lo = edgeEffectI00000oIO;
/* 20 */            return edgeEffectI00000oIO;
                }

                public final EdgeEffect I0000O() {
/* 1 */             EdgeEffect edgeEffect = this.I000II;
/* 3 */             if (edgeEffect != null) {
/* 20 */                return edgeEffect;
                    }
/* 7 */             EdgeEffect edgeEffectI00000oIO = I00000oIO(OIilII.I00iiI);
/* 11 */            this.I000II = edgeEffectI00000oIO;
/* 20 */            return edgeEffectI00000oIO;
                }

                public final EdgeEffect I0000oI00() {
/* 1 */             EdgeEffect edgeEffect = this.I0000O;
/* 3 */             if (edgeEffect != null) {
/* 20 */                return edgeEffect;
                    }
/* 7 */             EdgeEffect edgeEffectI00000oIO = I00000oIO(OIilII.I00iOIl);
/* 11 */            this.I0000O = edgeEffectI00000oIO;
/* 20 */            return edgeEffectI00000oIO;
                }
            }
