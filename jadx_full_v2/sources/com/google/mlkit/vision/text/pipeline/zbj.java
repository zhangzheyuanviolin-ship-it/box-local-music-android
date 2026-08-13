            package com.google.mlkit.vision.text.pipeline;

            import java.lang.invoke.VarHandle;
            import java.nio.ByteBuffer;
            import p000.OIiilo1Ool0o;
            import p000.i0llli;
            import p000.i0o0li;
            import p000.i10i11Ili;
            
            final class zbj {
                public static i0llli zba(ByteBuffer byteBuffer, i10i11Ili i10i11ili) {
/* 1 */             byte[] bArrArray = byteBuffer.array();
/* 7 */             int iZbb = zbb(i10i11ili.I00iio);
/* 13 */            int i = i10i11ili.I00iiI;
/* 15 */            int i2 = i10i11ili.I00iiO;
/* 17 */            i0o0li i0o0liVar = new i0o0li();
/* 23 */            if (i >= 32767 || i < 0) {
/* 64 */                OIiilo1Ool0o.I00100o1O0lo();
/* 20 */                return null;
                    }
/* 27 */            if (i2 >= 32767 || i2 < 0) {
/* 60 */                OIiilo1Ool0o.I00100o1O0lo();
/* 20 */                return null;
                    }
/* 31 */            i0o0liVar.I00000oIO = i;
/* 33 */            i0o0liVar.I00000oOI = i2;
/* 35 */            VarHandle.storeStoreFence();
/* 42 */            long j = i10i11ili.I00ilI0I1 * 1000;
/* 45 */            i0llli i0llliVar = new i0llli();
/* 48 */            i0llliVar.I00000oIO = bArrArray;
/* 50 */            i0llliVar.I00000oOI = j;
/* 52 */            i0llliVar.I0000Il00O = i0o0liVar;
/* 54 */            i0llliVar.I0000O = iZbb;
/* 56 */            VarHandle.storeStoreFence();
/* 59 */            return i0llliVar;
                }

                public static int zbb(int i) {
/* 2 */             if (i == 1) {
/* 13 */                return 4;
                    }
/* 6 */             if (i != 2) {
                        return i != 3 ? 1 : 2;
                    }
/* 4 */             return 3;
                }
            }
