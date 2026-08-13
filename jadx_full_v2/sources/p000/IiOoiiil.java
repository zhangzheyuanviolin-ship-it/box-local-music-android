            package p000;

            import android.content.res.AssetManager;
            import java.io.File;
            import java.io.FileInputStream;
            import java.io.FileNotFoundException;
            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            import java.util.concurrent.Executor;
            
            public final class IiOoiiil {
                public Executor I00000oIO;
                public OOIoilO1I10I I00000oOI;
                public File I0000Il00O;
                public String I0000O;
                public boolean I0000oI00;
                public IiOoliOIo1[] I0001Ioi1lo;
                public byte[] I000II;

                public final FileInputStream I00000oIO(AssetManager assetManager, String str) {
                    try {
/* 5 */                 return assetManager.openFd(str).createInputStream();
                    } catch (FileNotFoundException e) {
/* 11 */                String message = e.getMessage();
/* 15 */                if (message == null) {
/* 22 */                    return null;
                        }
/* 19 */                message.contains("compressed");
/* 22 */                return null;
                    }
                }

                public final void I00000oOI(int i, IOException iOException) {
/* 1 */             Executor executor = this.I00000oIO;
/* 6 */             II0OlOll iI0OlOll = new II0OlOll(4);
/* 9 */             iI0OlOll.I00iiO = this;
/* 11 */            iI0OlOll.I00iiI = i;
/* 13 */            iI0OlOll.I00iio = iOException;
/* 15 */            VarHandle.storeStoreFence();
/* 18 */            executor.execute(iI0OlOll);
                }
            }
