            package p000;

            import java.io.File;
            import java.util.concurrent.atomic.AtomicBoolean;
            
            public class IlIi00o implements IOO11Oio {
                public final File I00000oIO;
                public final OiliO1i1iIII I00000oOI;
                public final AtomicBoolean I0000Il00O = new AtomicBoolean(false);

                public IlIi00o(File file, OiliO1i1iIII oiliO1i1iIII) {
/* 4 */             this.I00000oIO = file;
/* 6 */             this.I00000oOI = oiliO1i1iIII;
                }

                @Override
                public final void close() {
/* 4 */             this.I0000Il00O.set(true);
                }
            }
