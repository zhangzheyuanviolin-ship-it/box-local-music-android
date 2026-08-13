            package p000;

            import android.util.Log;
            import java.io.InputStream;
            import java.io.OutputStream;
            
            public abstract class IlIli001 {
                public static IIOoi0ooOoO I0000Il00O(IIi0io1lIo iIi0io1lIo, int i) {
/* 5 */             IIOoOiOI iIOoOiOII00oliIiO01i = iIi0io1lIo.I00oliIiO01i(IIi0I0I0o.I01OOIlI, IIi0I0I0o.I01OOiI1o);
/* 13 */            IIOoOiOI iIOoOiOII00oliIiO01i2 = iIi0io1lIo.I00oliIiO01i(IIi0I0I0o.I01Io001O, IIi0I0I0o.I011olOoO);
/* 19 */            if ((iIOoOiOII00oliIiO01i instanceof IIi0I0I0o) && (iIOoOiOII00oliIiO01i2 instanceof IIOoi0ooOoO)) {
/* 25 */                return (IIOoi0ooOoO) iIOoOiOII00oliIiO01i2;
                    }
/* 28 */            boolean z = iIOoOiOII00oliIiO01i instanceof IIOoIilO;
/* 30 */            if (z && (iIOoOiOII00oliIiO01i2 instanceof IIOoIilO)) {
/* 36 */                IIOoIilO iIOoIilO = (IIOoIilO) iIOoOiOII00oliIiO01i2;
/* 44 */                if (i < iIOoIilO.I00iOIl.size()) {
/* 46 */                    IIOoOiOI iIOoOiOII00lll10 = iIOoIilO.I00lll10(i);
/* 52 */                    if (iIOoOiOII00lll10 instanceof IIOoi0ooOoO) {
/* 54 */                        return (IIOoi0ooOoO) iIOoOiOII00lll10;
                            }
                        }
                    } else if (iIOoOiOII00oliIiO01i2 != null && !z && !(iIOoOiOII00oliIiO01i2 instanceof IIOoIilO)) {
/* 81 */                Log.e("PdfBox-Android", "Expected DecodeParams to be an Array or Dictionary but found ".concat(iIOoOiOII00oliIiO01i2.getClass().getName()));
                    }
/* 86 */            return new IIOoi0ooOoO();
                }

                public abstract Ii1i1il100 I00000oIO(InputStream inputStream, OutputStream outputStream, IIi0io1lIo iIi0io1lIo, int i);

                public Ii1i1il100 I00000oOI(InputStream inputStream, OutputStream outputStream, IIi0io1lIo iIi0io1lIo, int i) {
/* 1 */             return I00000oIO(inputStream, outputStream, iIi0io1lIo, i);
                }
            }
