            package p000;

            import android.graphics.RuntimeShader;
            import kotlin.jvm.functions.Function1;
            
            public final class I1i1Il1oOiII implements Function1 {
                public double I00iOIl;
                public RuntimeShader I00iiI;
                public long I00iiO;
                public OioIoiOi I00iio;
                public OIooO00 I00ilI0I1;
                public OIooO1iiliI I00ilO0;
                public OIooO1iiliI I00io1l;
                public OIooO1iiliI I00ioIO;

                @Override
                public final Object invoke(Object obj) {
/* 3 */             double d = this.I00iOIl;
/* 5 */             RuntimeShader runtimeShader = this.I00iiI;
/* 7 */             long j = this.I00iiO;
/* 9 */             OioIoiOi oioIoiOi = this.I00iio;
/* 11 */            OIooO00 oIooO00 = this.I00ilI0I1;
/* 13 */            OIooO1iiliI oIooO1iiliI = this.I00ilO0;
/* 15 */            OIooO1iiliI oIooO1iiliI2 = this.I00io1l;
/* 17 */            OIooO1iiliI oIooO1iiliI3 = this.I00ioIO;
/* 21 */            IilloIOOO0i iilloIOOO0i = (IilloIOOO0i) obj;
/* 30 */            if (d < 0.2d && ((Ol1lOlo1oo) Ol1l1lI1Ili.I0010o(oIooO00.I00iiI, oIooO00)).I0000Il00O >= 0.2d) {
/* 46 */                I01Io1ilOIIo i01Io1ilOIIo = OOl1i000OO.I00iOIl;
/* 61 */                oIooO1iiliI.I000O01llI0(OOl1i000OO.I00iOIl.I0000O().nextFloat() * 1000.0f);
                    }
/* 64 */            oIooO00.I000II(d);
/* 73 */            runtimeShader.setFloatUniform("iTime", oIooO1iiliI2.I000II());
/* 105 */           runtimeShader.setFloatUniform("iResolution", Float.intBitsToFloat((int) (iilloIOOO0i.I0000oI00() >> 32)), Float.intBitsToFloat((int) (iilloIOOO0i.I0000oI00() & 4294967295L)));
/* 127 */           runtimeShader.setFloatUniform("bgColor", IOOiio0i.I000O01llI0(j), IOOiio0i.I000II(j), IOOiio0i.I0000oI00(j), IOOiio0i.I0000O(j));
/* 136 */           runtimeShader.setFloatUniform("amplitude", oIooO1iiliI3.I000II());
/* 145 */           runtimeShader.setFloatUniform("pOffset", oIooO1iiliI.I000II());
/* 160 */           IilloIOOO0i.I00oII(iilloIOOO0i, oioIoiOi, 0L, 0L, 0.0f, null, null, 0, 126);
/* 163 */           return OoiIlOl1iI.I00000oIO;
                }
            }
