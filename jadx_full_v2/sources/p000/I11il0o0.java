            package p000;

            import android.os.Bundle;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.LinkedHashSet;
            import java.util.List;
            
            public final class I11il0o0 implements OiIoOil {
                public final int I00000oIO;
                public Object I00000oOI;

                public I11il0o0(int i) {
/* 1 */             this.I00000oIO = i;
                }

                @Override
                public final Bundle I00000oIO() {
                    switch (this.I00000oIO) {
                        case 0:
/* 50 */                    Bundle bundle = new Bundle();
/* 57 */                    ((I11io0O0O1o1) this.I00000oOI).I0010o();
/* 60 */                    return bundle;
                        default:
/* 15 */                    Bundle bundleI00000oIO = iOiIOo1010i.I00000oIO((OIoi0IIoi[]) Arrays.copyOf(new OIoi0IIoi[0], 0));
/* 23 */                    List listI00iIi0i1o = IOOi0Ool1i.I00iIi0i1o((LinkedHashSet) this.I00000oOI);
/* 44 */                    bundleI00000oIO.putStringArrayList("classes_to_restore", listI00iIi0i1o instanceof ArrayList ? (ArrayList) listI00iIi0i1o : new ArrayList<>(listI00iIi0i1o));
/* 47 */                    return bundleI00000oIO;
                    }
                }
            }
