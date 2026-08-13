            package p000;

            import android.graphics.Bitmap;
            import com.google.mlkit.genai.imagedescription.ImageDescriber;
            
            public final class IloioIIloi extends ioIOOi0 {
                public OI10i0Il I00000oIO;
                public Ii0110 I00000oOI;
                public OI10i0Il I0000Il00O;
                public OI10i0Il I0000O;
                public ImageDescriber I0000oI00;
                public OI10i0Il I0001Ioi1lo;
                public Ol1OlloIO I000II;

                @Override
                public final void I00000oIO(IoiO1IO1I1i ioiO1IO1I1i) throws Exception {
/* 1 */             Bitmap bitmapI00000oIO = ioOiOIli1i.I00000oIO(ioiO1IO1I1i);
/* 5 */             ioiO1IO1I1i.close();
/* 10 */            this.I00000oIO.setValue(bitmapI00000oIO);
/* 13 */            Ii0110 ii0110 = this.I00000oOI;
/* 15 */            OI10i0Il oI10i0Il = this.I0000Il00O;
/* 17 */            OI10i0Il oI10i0Il2 = this.I0000O;
/* 19 */            ImageDescriber imageDescriber = this.I0000oI00;
/* 21 */            OI10i0Il oI10i0Il3 = this.I0001Ioi1lo;
/* 23 */            Ol1OlloIO ol1OlloIO = this.I000II;
/* 27 */            oI10i0Il.setValue(Boolean.TRUE);
/* 32 */            oI10i0Il2.setValue("");
/* 43 */            iOi1II01i0.I0000O(ii0110, null, null, new Ilol0Oo(imageDescriber, bitmapI00000oIO, ii0110, oI10i0Il3, oI10i0Il2, ol1OlloIO, oI10i0Il, null), 3);
                }

                @Override
                public final void I00000oOI(Ioi1lIO ioi1lIO) {
/* 9 */             IIlIOloOOO.I001iOo1i0O("Capture failed: ", ioi1lIO.getMessage(), "GeminiNanoHub");
/* 30 */            this.I0000O.setValue("Capture failed: " + ioi1lIO.getMessage());
/* 37 */            this.I0000Il00O.setValue(Boolean.FALSE);
                }
            }
