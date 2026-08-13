            package p000;

            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Map;
            
/* 3 */     public class OIlOoi00 extends OIlOiIo {
                public OIlOoi00() {
                }

                public List<String> I000lI() {
/* 3 */             ArrayList arrayList = new ArrayList();
/* 16 */            Iterator it = I00Io1lO().I00iOIl.entrySet().iterator();
/* 24 */            while (it.hasNext()) {
/* 36 */                IIi0I0I0o iIi0I0I0o = (IIi0I0I0o) ((Map.Entry) it.next()).getKey();
/* 44 */                if (!IIi0I0I0o.I0I0Oi.equals(iIi0I0I0o)) {
/* 48 */                    arrayList.add(iIi0I0I0o.I00iOIl);
                        }
                    }
/* 113 */           return arrayList;
                }

                public IIOoOiOI I000o00OoI0I(String str) {
/* 5 */             return I00Io1lO().I00oo1iO0ll(str);
                }

                public IIOoOiOI I000oI1ioi(String str, IIOoOiOI iIOoOiOI) {
/* 5 */             IIOoOiOI iIOoOiOII00oo1iO0ll = I00Io1lO().I00oo1iO0ll(str);
                    return iIOoOiOII00oo1iO0ll == null ? iIOoOiOI : iIOoOiOII00oo1iO0ll;
                }

                public void I00100l0(String str, IIOoOiOI iIOoOiOI) {
/* 1 */             IIOoOiOI iIOoOiOII000o00OoI0I = I000o00OoI0I(str);
/* 13 */            I00Io1lO().I010iIIOlo(IIi0I0I0o.I00ioIO(str), iIOoOiOI);
/* 16 */            I000OiO(iIOoOiOII000o00OoI0I, iIOoOiOI);
                }

                @Override
                public String toString() {
/* 3 */             StringBuilder sb = new StringBuilder();
/* 10 */            sb.append(super.toString());
/* 15 */            sb.append(", attributes={");
/* 22 */            Iterator<String> it = I000lI().iterator();
/* 30 */            while (it.hasNext()) {
/* 32 */                String next = it.next();
/* 38 */                sb.append(next);
/* 43 */                sb.append('=');
/* 50 */                sb.append(I000o00OoI0I(next));
/* 57 */                if (it.hasNext()) {
/* 61 */                    sb.append(", ");
                        }
                    }
/* 67 */            sb.append('}');
/* 70 */            return sb.toString();
                }

/* 4 */         public OIlOoi00(IIOoi0ooOoO iIOoi0ooOoO) {
/* 5 */             super(iIOoi0ooOoO);
                }
            }
