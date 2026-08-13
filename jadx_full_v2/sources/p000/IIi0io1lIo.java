            package p000;

            import java.io.ByteArrayInputStream;
            import java.io.ByteArrayOutputStream;
            import java.io.Closeable;
            import java.io.IOException;
            import java.io.InputStream;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.HashSet;
            
            public final class IIi0io1lIo extends IIOoi0ooOoO implements Closeable {
                public OiOOiIO1 I00iiI;
                public OiOOiI1lllOo I00iiO;
                public boolean I00iio;

                public final IIOooOII I010l1ol111() throws IOException {
                    ArrayList arrayList;
/* 1 */             OiOOiI1lllOo oiOOiI1lllOo = this.I00iiO;
/* 3 */             OiOOiIO1 oiOOiIO1 = this.I00iiI;
/* 6 */             if (oiOOiIO1 != null && oiOOiIO1.I00iiI == null) {
/* 15 */                IioIoO10iOiI.I000OOo1O("COSStream has been closed and cannot be read. Perhaps its enclosing PDDocument has been closed?");
/* 5 */                 return null;
                    }
/* 21 */            if (this.I00iio) {
/* 277 */               I000II.I001IO000("Cannot read while there is an open stream writer");
/* 5 */                 return null;
                    }
/* 23 */            if (oiOOiIO1 == null) {
/* 25 */                oiOOiI1lllOo.getClass();
/* 33 */                this.I00iiI = new OiOOiIO1(oiOOiI1lllOo);
                    }
/* 39 */            InputStream oOl1ilO = new OOl1ilO(this.I00iiI);
/* 44 */            IIOoOiOI iIOoOiOII00oII = I00oII(IIi0I0I0o.I01OOiI1o);
/* 52 */            if (iIOoOiOII00oII instanceof IIi0I0I0o) {
/* 56 */                arrayList = new ArrayList(1);
/* 67 */                arrayList.add(IlIlioo01O.I00000oOI.I00000oIO((IIi0I0I0o) iIOoOiOII00oII));
                    } else if (iIOoOiOII00oII instanceof IIOoIilO) {
/* 75 */                IIOoIilO iIOoIilO = (IIOoIilO) iIOoOiOII00oII;
/* 77 */                ArrayList arrayList2 = iIOoIilO.I00iOIl;
/* 85 */                ArrayList arrayList3 = new ArrayList(arrayList2.size());
/* 93 */                for (int i = 0; i < arrayList2.size(); i++) {
/* 95 */                    IIOoOiOI iIOoOiOII00l0I0l0lO1 = iIOoIilO.I00l0I0l0lO1(i);
/* 101 */                   if (!(iIOoOiOII00l0I0l0lO1 instanceof IIi0I0I0o)) {
/* 127 */                       throw new IOException("Forbidden type in filter array: ".concat(iIOoOiOII00l0I0l0lO1 == null ? "null" : iIOoOiOII00l0I0l0lO1.getClass().getName()));
                            }
/* 136 */                   arrayList3.add(IlIlioo01O.I00000oOI.I00000oIO((IIi0I0I0o) iIOoOiOII00l0I0l0lO1));
                        }
/* 142 */               arrayList = arrayList3;
                    } else {
/* 146 */               arrayList = new ArrayList();
                    }
/* 149 */           int i2 = IIOooOII.I00iiI;
/* 155 */           if (arrayList.isEmpty()) {
/* 161 */               return new IIOooOII(oOl1ilO, Collections.EMPTY_LIST);
                    }
/* 171 */           ArrayList arrayList4 = new ArrayList(arrayList.size());
/* 178 */           if (arrayList.size() > 1 && new HashSet(arrayList).size() != arrayList.size()) {
/* 198 */               IioIoO10iOiI.I000OOo1O("Duplicate");
/* 5 */                 return null;
                    }
/* 206 */           for (int i3 = 0; i3 < arrayList.size(); i3++) {
/* 208 */               if (oiOOiI1lllOo != null) {
/* 212 */                   OiOOiIO1 oiOOiIO12 = new OiOOiIO1(oiOOiI1lllOo);
/* 230 */                   arrayList4.add(((IlIli001) arrayList.get(i3)).I00000oOI(oOl1ilO, new OOl1lI0oI(oiOOiIO12), this, i3));
/* 235 */                   oOl1ilO = new IIOoo1i(oiOOiIO12, oiOOiIO12);
                        } else {
/* 241 */                   ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
/* 254 */                   arrayList4.add(((IlIli001) arrayList.get(i3)).I00000oOI(oOl1ilO, byteArrayOutputStream, this, i3));
/* 263 */                   oOl1ilO = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
                        }
                    }
/* 271 */           return new IIOooOII(oOl1ilO, arrayList4);
                }

                public final OOl1ilO I010lI0oi() {
/* 1 */             OiOOiIO1 oiOOiIO1 = this.I00iiI;
/* 4 */             if (oiOOiIO1 != null && oiOOiIO1.I00iiI == null) {
/* 13 */                IioIoO10iOiI.I000OOo1O("COSStream has been closed and cannot be read. Perhaps its enclosing PDDocument has been closed?");
/* 3 */                 return null;
                    }
/* 19 */            if (this.I00iio) {
/* 45 */                I000II.I001IO000("Cannot read while there is an open stream writer");
/* 3 */                 return null;
                    }
/* 21 */            if (oiOOiIO1 == null) {
/* 23 */                OiOOiI1lllOo oiOOiI1lllOo = this.I00iiO;
/* 25 */                oiOOiI1lllOo.getClass();
/* 33 */                this.I00iiI = new OiOOiIO1(oiOOiI1lllOo);
                    }
/* 39 */            return new OOl1ilO(this.I00iiI);
                }

                public final IIi0OI0 I010o0o0oO() throws IOException {
/* 1 */             OiOOiIO1 oiOOiIO1 = this.I00iiI;
/* 4 */             if (oiOOiIO1 != null && oiOOiIO1.I00iiI == null) {
/* 13 */                IioIoO10iOiI.I000OOo1O("COSStream has been closed and cannot be read. Perhaps its enclosing PDDocument has been closed?");
/* 3 */                 return null;
                    }
/* 19 */            if (this.I00iio) {
/* 54 */                I000II.I001IO000("Cannot have more than one open stream writer.");
/* 3 */                 return null;
                    }
/* 21 */            io0iolo.I00000oOI(oiOOiIO1);
/* 24 */            OiOOiI1lllOo oiOOiI1lllOo = this.I00iiO;
/* 26 */            oiOOiI1lllOo.getClass();
/* 34 */            this.I00iiI = new OiOOiIO1(oiOOiI1lllOo);
/* 40 */            OOl1lI0oI oOl1lI0oI = new OOl1lI0oI(this.I00iiI);
/* 44 */            this.I00iio = true;
/* 48 */            return new IIi0OI0(this, oOl1lI0oI);
                }

                @Override
                public final void close() {
/* 1 */             OiOOiIO1 oiOOiIO1 = this.I00iiI;
/* 3 */             if (oiOOiIO1 != null) {
/* 5 */                 oiOOiIO1.close();
                    }
                }
            }
