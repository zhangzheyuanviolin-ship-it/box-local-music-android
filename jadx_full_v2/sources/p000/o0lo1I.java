            package p000;

            import android.content.Context;
            import com.google.mlkit.genai.common.GenAiException;
            
            public final class o0lo1I {
                public static final iolOOiI I00000oOI = new iolOOiI(28);
                public static volatile o0lo1I I0000Il00O;
                public IOiOol0 I00000oIO;

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static Object I00000oIO(o0lo1I o0lo1i, Context context, String str, String str2, IOoilo iOoilo) throws Throwable {
                    o0lli1O o0lli1o;
/* 3 */             if (iOoilo instanceof o0lli1O) {
/* 6 */                 o0lli1o = (o0lli1O) iOoilo;
/* 8 */                 int i = o0lli1o.I00iiO;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    o0lli1o.I00iiO = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    o0lli1o = new o0lli1O(o0lo1i, iOoilo);
                        }
                    }
/* 25 */            Object objI00OOll1 = o0lli1o.I00iOIl;
/* 27 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 29 */            int i2 = o0lli1o.I00iiO;
/* 31 */            IOoil1iiIilo iOoil1iiIilo = null;
/* 33 */            if (i2 == 0) {
/* 51 */                lIoii1l01l0i.I00000oOI(objI00OOll1);
/* 54 */                IOiOol0 iOiOol0 = o0lo1i.I00000oIO;
/* 56 */                o0lli1o.I00iio = str;
/* 58 */                o0lli1o.I00ilI0I1 = str2;
/* 60 */                o0lli1o.I00iiO = 1;
/* 76 */                objI00OOll1 = str.length() == 0 ? null : iOiOol0.I00OOll1(context, new Ii1l1iio0lO0(str, 2, iOoil1iiIilo), o0lli1o);
/* 81 */                if (objI00OOll1 == ii0111o) {
/* 399 */                   return ii0111o;
                        }
                    } else {
/* 35 */                if (i2 != 1) {
/* 47 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 31 */                    return null;
                        }
/* 37 */                str2 = o0lli1o.I00ilI0I1;
/* 39 */                str = o0lli1o.I00iio;
/* 41 */                lIoii1l01l0i.I00000oOI(objI00OOll1);
                    }
/* 83 */            o0loO110 o0loo110 = (o0loO110) objI00OOll1;
/* 85 */            if (o0loo110 == null) {
/* 31 */                return null;
                    }
/* 88 */            String str3 = o0loo110.I0000O;
/* 90 */            if (str2 == null || O0000Ioio00.I0000O(str3, str2)) {
/* 155 */               return o0loo110;
                    }
/* 131 */           StringBuilder sb = new StringBuilder(str2.length() + String.valueOf(str3).length() + String.valueOf(str).length() + 42 + 33 + 60);
/* 138 */           IIl001iO0Io.I001lIiIIo1O(sb, "Cached context '", str, "' was created with model '", str3);
/* 154 */           throw new GenAiException(IIlIOloOOO.I0010I0i(sb, "', but is being used with model '", str2, "'. Please either update the cache or use the matching model."), (Throwable) null, GenAiException.ErrorCode.CACHE_PROCESSING_ERROR);
                }
            }
