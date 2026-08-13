            package p000;

            import android.util.Size;
            import java.io.Serializable;
            import java.lang.invoke.VarHandle;
            
            public final class II1011i {
                public int I00000oIO;
                public int I00000oOI;
                public boolean I0000Il00O;
                public Serializable I0000O;

                /* JADX WARN: Multi-variable type inference failed */
                public static II1011i I00000oOI(I00io1l... i00io1lArr) {
/* 3 */             II1011i iI1011i = new II1011i();
/* 7 */             iI1011i.I00000oIO = -1;
/* 9 */             iI1011i.I00000oOI = -1;
/* 12 */            iI1011i.I0000Il00O = false;
/* 14 */            iI1011i.I0000O = i00io1lArr;
/* 16 */            VarHandle.storeStoreFence();
/* 29 */            return iI1011i;
                }

                public Size I00000oIO(IoiIli1i0Oil ioiIli1i0Oil) {
/* 2 */             int iI001lloI = ioiIli1i0Oil.I001lloI(0);
/* 13 */            Size size = (Size) ioiIli1i0Oil.I00000oOI(IoiIli1i0Oil.I001i1lo1io, null);
/* 15 */            int i = this.I00000oOI;
/* 17 */            int i2 = this.I00000oIO;
/* 19 */            if (size != null) {
/* 29 */                int iI00000oIO = iOioOiio.I00000oIO(iOioOiio.I00000oOI(iI001lloI), i2, 1 == i);
/* 35 */                if (iI00000oIO == 90 || iI00000oIO == 270) {
/* 51 */                    return new Size(size.getHeight(), size.getWidth());
                        }
                    }
/* 77 */            return size;
                }
            }
