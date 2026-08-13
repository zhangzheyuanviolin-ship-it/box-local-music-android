            package p000;

            import java.io.File;
            import java.io.FileInputStream;
            import java.io.IOException;
            import java.io.InputStream;
            import java.io.SequenceInputStream;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Collection;
            import java.util.Collections;
            import java.util.Enumeration;
            import java.util.TreeMap;
            
/* 27 */    public final class i0IOO1 extends IoiOloi {
                public i0Il1IIOi I00iOIl;
                public long I00iiI;
                public long I00iiO;

                public final InputStream I00ioIO(long j, long j2) throws IOException {
/* 3 */             long jI00l0I0l0lO1 = I00l0I0l0lO1(this.I00iiI);
/* 12 */            long jI00l0I0l0lO12 = I00l0I0l0lO1(j2 + jI00l0I0l0lO1) - jI00l0I0l0lO1;
/* 13 */            i0Il1IIOi i0il1iioi = this.I00iOIl;
/* 15 */            TreeMap treeMap = i0il1iioi.I00iOIl;
/* 21 */            if (jI00l0I0l0lO1 < 0 || jI00l0I0l0lO12 < 0) {
/* 186 */               StringBuilder sbI001iOo1i0O = Oi010OO0.I001iOo1i0O(jI00l0I0l0lO1, "Invalid input parameters ", ", ");
/* 190 */               sbI001iOo1i0O.append(jI00l0I0l0lO12);
/* 551 */               throw new i0O0lI1oiO(sbI001iOo1i0O.toString());
                    }
/* 27 */            long j3 = jI00l0I0l0lO1 + jI00l0I0l0lO12;
/* 35 */            if (j3 > i0il1iioi.I00ioIO()) {
/* 165 */               StringBuilder sbI001iOo1i0O2 = Oi010OO0.I001iOo1i0O(i0il1iioi.I00ioIO(), "Trying to access archive out of bounds. Archive ends at: ", ". Tried accessing: ");
/* 169 */               sbI001iOo1i0O2.append(j3);
/* 179 */               throw new i0O0lI1oiO(sbI001iOo1i0O2.toString());
                    }
/* 45 */            Long l = (Long) treeMap.floorKey(Long.valueOf(jI00l0I0l0lO1));
/* 55 */            Long l2 = (Long) treeMap.floorKey(Long.valueOf(j3));
/* 61 */            if (l.equals(l2)) {
/* 69 */                return new OOl1ilO(i0il1iioi.I00l0I0l0lO1(jI00l0I0l0lO1, l), jI00l0I0l0lO12);
                    }
/* 75 */            ArrayList arrayList = new ArrayList();
/* 82 */            arrayList.add(i0il1iioi.I00l0I0l0lO1(jI00l0I0l0lO1, l));
/* 90 */            Collection collectionValues = treeMap.subMap(l, false, l2, false).values();
/* 98 */            if (!collectionValues.isEmpty()) {
/* 102 */               Enumeration enumeration = Collections.enumeration(collectionValues);
/* 106 */               i0O1Ooiiio i0o1ooiiio = new i0O1Ooiiio();
/* 109 */               i0o1ooiiio.I00iOIl = enumeration;
/* 111 */               i0o1ooiiio.I00000oIO();
/* 114 */               VarHandle.storeStoreFence();
/* 117 */               arrayList.add(i0o1ooiiio);
                    }
/* 142 */           arrayList.add(new OOl1ilO(new FileInputStream((File) treeMap.get(l2)), jI00l0I0l0lO12 - (l2.longValue() - jI00l0I0l0lO1)));
/* 151 */           return new SequenceInputStream(Collections.enumeration(arrayList));
                }

                public final long I00l0I0l0lO1(long j) {
/* 1 */             i0Il1IIOi i0il1iioi = this.I00iOIl;
/* 7 */             if (j < 0) {
/* 3 */                 return 0L;
                    }
                    return j > i0il1iioi.I00ioIO() ? i0il1iioi.I00ioIO() : j;
                }

                @Override
/* 28 */        public final void close() {
                }
            }
