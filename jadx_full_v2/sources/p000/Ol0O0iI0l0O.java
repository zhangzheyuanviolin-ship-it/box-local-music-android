            package p000;

            import java.io.IOException;
            import java.util.Iterator;
            
            public abstract class Ol0O0iI0l0O extends Ooioo0o1l0 implements Ol0O1I, OoOI11 {
                @Override
                public abstract Ol0O0iI0l0O I00li1OI(boolean z);

                @Override
                public abstract Ol0O0iI0l0O I00lli11(OoOI1i1i ooOI1i1i);

                public String toString() throws IOException {
/* 3 */             StringBuilder sb = new StringBuilder();
/* 10 */            Iterator it = getAnnotations().iterator();
/* 18 */            while (it.hasNext()) {
/* 37 */                String[] strArr = {"[", IiOOllOI0io.I0000oI00.I001IO000((I111oOiIiO0) it.next(), null), "] "};
/* 43 */                for (int i = 0; i < 3; i++) {
/* 47 */                    sb.append(strArr[i]);
                        }
                    }
/* 57 */            sb.append(I00iOIl());
/* 70 */            if (!I00OIl().isEmpty()) {
/* 87 */                IOOi0Ool1i.I00IioO0OiOi(I00OIl(), sb, ", ", "<", ">", null, 112);
                    }
/* 94 */            if (I00iiI()) {
/* 98 */                sb.append("?");
                    }
/* 101 */           return sb.toString();
                }
            }
