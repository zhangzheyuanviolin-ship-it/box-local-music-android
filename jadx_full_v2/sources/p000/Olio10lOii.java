            package p000;

            import android.util.Size;
            import android.view.Surface;
            import com.google.common.util.concurrent.ListenableFuture;
            import java.lang.invoke.VarHandle;
            
            public final class Olio10lOii implements I1Olli1oIi {
                public OlioOil I00iOIl;
                public OlioII I00iiI;
                public int I00iiO;
                public I1lIol0O I00iio;
                public I1lIol0O I00ilI0I1;

                @Override
                public final ListenableFuture apply(Object obj) {
/* 1 */             OlioOil olioOil = this.I00iOIl;
/* 3 */             OlioII olioII = this.I00iiI;
/* 5 */             int i = this.I00iiO;
/* 7 */             I1lIol0O i1lIol0O = this.I00iio;
/* 9 */             I1lIol0O i1lIol0O2 = this.I00ilI0I1;
/* 11 */            Surface surface = (Surface) obj;
/* 13 */            olioOil.getClass();
/* 16 */            surface.getClass();
/* 19 */            char c = 1;
                    try {
/* 20 */                olioII.I0000O();
/* 27 */                Size size = olioOil.I000II.I00000oIO;
/* 29 */                OliolIlIO oliolIlIO = new OliolIlIO();
/* 37 */                oliolIlIO.I00iOIl = new Object();
/* 41 */                float[] fArr = new float[16];
/* 43 */                oliolIlIO.I00ilI0I1 = fArr;
/* 45 */                float[] fArr2 = new float[16];
/* 47 */                oliolIlIO.I00ilO0 = fArr2;
/* 54 */                oliolIlIO.I00l0I0l0lO1 = false;
/* 56 */                oliolIlIO.I00l0OO0IO = false;
/* 58 */                oliolIlIO.I00iiI = surface;
/* 60 */                oliolIlIO.I00iiO = i;
/* 62 */                oliolIlIO.I00iio = size;
/* 64 */                OliolIlIO.I00000oIO(fArr, new float[16], i1lIol0O);
/* 67 */                OliolIlIO.I00000oIO(fArr2, new float[16], i1lIol0O2);
/* 72 */                Olio1i0OI00i olio1i0OI00i = new Olio1i0OI00i(c == true ? 1 : 0);
/* 75 */                olio1i0OI00i.I00iiI = oliolIlIO;
/* 77 */                VarHandle.storeStoreFence();
/* 80 */                IIiOiI0il iIiOiI0ilI00000oIO = iOiiloIII0O.I00000oIO(olio1i0OI00i);
/* 84 */                VarHandle.storeStoreFence();
/* 89 */                Olio0o olio0o = new Olio0o(1);
/* 92 */                olio0o.I00iiI = olioII;
/* 94 */                VarHandle.storeStoreFence();
/* 103 */               iIiOiI0ilI00000oIO.I00iiI.addListener(olio0o, Iii11l.I00000oIO());
/* 114 */               lII1OI11o1I.I0000oI00("Consumer can only be linked once.", olioII.I00100o1O0lo == null);
/* 117 */               olioII.I00100o1O0lo = oliolIlIO;
/* 119 */               return iIllIoiiIO.I0000O(oliolIlIO);
                    } catch (IiIO1IliI1Ol e) {
/* 127 */               return new Ioil1IIo(e, 1);
                    }
                }
            }
