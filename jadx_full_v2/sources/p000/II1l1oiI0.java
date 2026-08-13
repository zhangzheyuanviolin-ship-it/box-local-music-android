            package p000;

            import android.content.Context;
            import android.graphics.Bitmap;
            import java.lang.invoke.VarHandle;
            
            public final class II1l1oiI0 implements IllOOo00lI {
                public II1o0111IO0 I00iOIl;
                public Bitmap I00iiI;
                public int I00iiO;
                public boolean I00iio;
                public O1ol100o0O I00ilI0I1;
                public Context I00ilO0;
                public OloIl1l1oOii I00io1l;
                public O1oIOiI11o0 I00ioIO;
                public String I00l0I0l0lO1;

                @Override
                public final Object invoke() {
/* 1 */             II1o0111IO0 iI1o0111IO0 = this.I00iOIl;
/* 3 */             Bitmap bitmap = this.I00iiI;
/* 5 */             int i = this.I00iiO;
/* 7 */             boolean z = this.I00iio;
/* 9 */             O1ol100o0O o1ol100o0O = this.I00ilI0I1;
/* 11 */            Context context = this.I00ilO0;
/* 13 */            OloIl1l1oOii oloIl1l1oOii = this.I00io1l;
/* 15 */            O1oIOiI11o0 o1oIOiI11o0 = this.I00ioIO;
/* 17 */            String str = this.I00l0I0l0lO1;
/* 19 */            OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 21 */            Bitmap bitmap2 = iI1o0111IO0.I000oI1ioi;
/* 23 */            if (bitmap2 != null) {
/* 26 */                bitmap = bitmap2;
                    }
/* 29 */            if (i != iI1o0111IO0.I000lI) {
/* 31 */                return ooiIlOl1iI;
                    }
/* 32 */            if (z) {
/* 51 */                iOi1II01i0.I0000O(OooiooIOO.I00000oIO(iI1o0111IO0), IiiIil1lOIO.I00000oIO, null, new I000oI1ioi(i, iI1o0111IO0, o1oIOiI11o0, str, bitmap, (IOoil1iiIilo) null), 2);
/* 54 */                return ooiIlOl1iI;
                    }
/* 62 */            iI1o0111IO0.I000O01llI0.I00000oIO("Loading the vision model, one moment.", Ool0lIo1o000.I00iiI);
/* 67 */            II1lI0iOIoI iI1lI0iOIoI = new II1lI0iOIoI();
/* 70 */            iI1lI0iOIoI.I00iOIl = i;
/* 72 */            iI1lI0iOIoI.I00iiI = iI1o0111IO0;
/* 74 */            iI1lI0iOIoI.I00iiO = o1oIOiI11o0;
/* 76 */            iI1lI0iOIoI.I00iio = str;
/* 78 */            iI1lI0iOIoI.I00ilI0I1 = bitmap;
/* 80 */            VarHandle.storeStoreFence();
/* 86 */            O1ol100o0O.I001lIiIIo1O(o1ol100o0O, context, oloIl1l1oOii, o1oIOiI11o0, iI1lI0iOIoI, 8);
/* 110 */           return ooiIlOl1iI;
                }
            }
