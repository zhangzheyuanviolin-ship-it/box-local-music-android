            package p000;

            import android.content.Context;
            import android.graphics.Bitmap;
            
            public final class I1o1Ii0I {
                public Context I00000oIO;
                public Ii0110 I00000oOI;
                public OllO00oiil I0000Il00O;
                public OllO00oiil I0000O;
                public volatile boolean I0000oI00;
                public volatile boolean I0001Ioi1lo;

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I00000oIO(Bitmap bitmap, IOoilo iOoilo) {
                    I1o101lOllIi i1o101lOllIi;
/* 3 */             if (iOoilo instanceof I1o101lOllIi) {
/* 6 */                 i1o101lOllIi = (I1o101lOllIi) iOoilo;
/* 8 */                 int i = i1o101lOllIi.I00iiO;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    i1o101lOllIi.I00iiO = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    i1o101lOllIi = new I1o101lOllIi(this, iOoilo);
                        }
                    }
/* 25 */            Object objI0000oI00 = i1o101lOllIi.I00iOIl;
/* 27 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 29 */            int i2 = i1o101lOllIi.I00iiO;
/* 31 */            IOoil1iiIilo iOoil1iiIilo = null;
/* 32 */            int i3 = 1;
/* 33 */            if (i2 == 0) {
/* 47 */                lIoii1l01l0i.I00000oOI(objI0000oI00);
/* 50 */                IiI0oillOO10 iiI0oillOO10 = IiiIil1lOIO.I00000oIO;
/* 54 */                I1iOI0oo i1iOI0oo = new I1iOI0oo(bitmap, iOoil1iiIilo, i3);
/* 57 */                i1o101lOllIi.I00iiO = 1;
/* 59 */                objI0000oI00 = iOi1II01i0.I0000oI00(iiI0oillOO10, i1iOI0oo, i1o101lOllIi);
/* 63 */                if (objI0000oI00 == ii0111o) {
/* 65 */                    return ii0111o;
                        }
                    } else {
/* 35 */                if (i2 != 1) {
/* 43 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 31 */                    return null;
                        }
/* 37 */                lIoii1l01l0i.I00000oOI(objI0000oI00);
                    }
/* 106 */           return objI0000oI00;
                }
            }
