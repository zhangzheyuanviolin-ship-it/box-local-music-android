            package p000;

            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Map;
            
            public abstract class li0IoO01I0l0 {
                public static final OIol1IIoIOoO I00000oIO(Io1O0I1i io1O0I1i) {
/* 4 */             Io1O0I1i io1O0I1i2 = new Io1O0I1i(1);
/* 25 */            for (String str : ((Map) io1O0I1i.I00iOIl).keySet()) {
/* 33 */                List listI00oIiI10 = io1O0I1i.I00oIiI10(str);
/* 37 */                if (listI00oIiI10 == null) {
/* 39 */                    listI00oIiI10 = Il01100l.I00iOIl;
                        }
/* 44 */                String strI0000O = IOOIli0I.I0000O(0, 0, 15, str);
/* 48 */                List list = listI00oIiI10;
/* 58 */                ArrayList arrayList = new ArrayList(IOOi1I.I0000O(list, 10));
/* 61 */                Iterator it = list.iterator();
/* 69 */                while (it.hasNext()) {
/* 83 */                    arrayList.add(IOOIli0I.I0000O(0, 0, 11, (String) it.next()));
                        }
/* 87 */                io1O0I1i2.I00OloOo(strI0000O, arrayList);
                    }
/* 97 */            return new OIol1oo0il((Map) io1O0I1i2.I00iOIl, true);
                }
            }
