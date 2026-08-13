            package p000;

            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            
/* 8 */     public class OIo0O1iOoool extends OIlOiIo {
                public static final String I00iiO = "UserProperties";

                public OIo0O1iOoool() {
/* 6 */             I000iOII(I00iiO);
                }

                public void I000lI(OIo0OI oIo0OI) {
/* 19 */            ((IIOoIilO) I00Io1lO().I00oII(IIi0I0I0o.I0I10lio10)).I00iOIl.add(oIo0OI.I00Io1lO());
/* 22 */            I000OOo1O();
                }

                public List<OIo0OI> I000o00OoI0I() {
/* 11 */            IIOoIilO iIOoIilO = (IIOoIilO) I00Io1lO().I00oII(IIi0I0I0o.I0I10lio10);
/* 21 */            ArrayList arrayList = new ArrayList(iIOoIilO.I00iOIl.size());
/* 31 */            for (int i = 0; i < iIOoIilO.I00iOIl.size(); i++) {
/* 44 */                arrayList.add(new OIo0OI((IIOoi0ooOoO) iIOoIilO.I00lll10(i), this));
                    }
/* 113 */           return arrayList;
                }

                public void I000oI1ioi(OIo0OI oIo0OI) {
/* 1 */             if (oIo0OI == null) {
/* 3 */                 return;
                    }
/* 20 */            ((IIOoIilO) I00Io1lO().I00oII(IIi0I0I0o.I0I10lio10)).I00oII(oIo0OI.I00Io1lO());
/* 23 */            I000OOo1O();
                }

                public void I00100l0(List<OIo0OI> list) {
/* 3 */             IIOoIilO iIOoIilO = new IIOoIilO();
/* 6 */             Iterator<OIo0OI> it = list.iterator();
/* 14 */            while (it.hasNext()) {
/* 28 */                iIOoIilO.I00iOIl.add(it.next().I00Io1lO());
                    }
/* 38 */            I00Io1lO().I010iIIOlo(IIi0I0I0o.I0I10lio10, iIOoIilO);
                }

                @Override
                public String toString() {
/* 25 */            return super.toString() + ", userProperties=" + I000o00OoI0I();
                }

/* 9 */         public OIo0O1iOoool(IIOoi0ooOoO iIOoi0ooOoO) {
/* 10 */            super(iIOoi0ooOoO);
                }

/* 48 */        public void I00100o1O0lo(OIo0OI oIo0OI) {
                }
            }
