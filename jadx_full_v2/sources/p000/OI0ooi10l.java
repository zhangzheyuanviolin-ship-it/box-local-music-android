            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Arrays;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.Map;
            import java.util.Set;
            import java.util.concurrent.atomic.AtomicBoolean;
            
/* 22 */    public final class OI0ooi10l {
                public final LinkedHashMap I00000oIO;
                public final iiOlilo0IIIl I00000oOI;

                public OI0ooi10l(LinkedHashMap linkedHashMap, boolean z) {
/* 4 */             this.I00000oIO = linkedHashMap;
/* 8 */             iiOlilo0IIIl iiolilo0iiil = new iiOlilo0IIIl();
/* 16 */            iiolilo0iiil.I00iOIl = new AtomicBoolean(z);
/* 18 */            VarHandle.storeStoreFence();
/* 21 */            this.I00000oOI = iiolilo0iiil;
                }

                public final Map I00000oIO() {
                    OIoi0IIoi oIoi0IIoi;
/* 3 */             Set<Map.Entry> setEntrySet = this.I00000oIO.entrySet();
/* 15 */            int iI00000oIO = O1Oii0o0Oi.I00000oIO(IOOi1I.I0000O(setEntrySet, 10));
/* 21 */            if (iI00000oIO < 16) {
/* 23 */                iI00000oIO = 16;
                    }
/* 26 */            LinkedHashMap linkedHashMap = new LinkedHashMap(iI00000oIO);
/* 37 */            for (Map.Entry entry : setEntrySet) {
/* 45 */                Object value = entry.getValue();
/* 51 */                if (value instanceof byte[]) {
/* 59 */                    byte[] bArr = (byte[]) value;
/* 66 */                    oIoi0IIoi = new OIoi0IIoi(entry.getKey(), Arrays.copyOf(bArr, bArr.length));
                        } else {
/* 80 */                    oIoi0IIoi = new OIoi0IIoi(entry.getKey(), entry.getValue());
                        }
/* 87 */                linkedHashMap.put(oIoi0IIoi.I00iOIl, oIoi0IIoi.I00iiI);
                    }
/* 91 */            return Collections.unmodifiableMap(linkedHashMap);
                }

                public final void I00000oOI() {
/* 11 */            if (((AtomicBoolean) this.I00000oOI.I00iOIl).get()) {
/* 16 */                I000II.I001IO000("Do mutate preferences once returned to DataStore.");
                    }
                }

                public final Object I0000Il00O(OOI0IO111Ii oOI0IO111Ii) {
/* 3 */             Object obj = this.I00000oIO.get(oOI0IO111Ii);
/* 9 */             if (!(obj instanceof byte[])) {
/* 29 */                return obj;
                    }
/* 11 */            byte[] bArr = (byte[]) obj;
/* 14 */            return Arrays.copyOf(bArr, bArr.length);
                }

                public final void I0000O(OOI0IO111Ii oOI0IO111Ii, Object obj) {
/* 1 */             I00000oOI();
/* 4 */             LinkedHashMap linkedHashMap = this.I00000oIO;
/* 6 */             if (obj == null) {
/* 8 */                 I00000oOI();
/* 11 */                linkedHashMap.remove(oOI0IO111Ii);
                    } else if (obj instanceof Set) {
/* 31 */                linkedHashMap.put(oOI0IO111Ii, Collections.unmodifiableSet(IOOi0Ool1i.I00iio((Set) obj)));
                    } else if (!(obj instanceof byte[])) {
/* 50 */                linkedHashMap.put(oOI0IO111Ii, obj);
                    } else {
/* 39 */                byte[] bArr = (byte[]) obj;
/* 46 */                linkedHashMap.put(oOI0IO111Ii, Arrays.copyOf(bArr, bArr.length));
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:27:0x005d  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final boolean equals(Object obj) {
/* 4 */             if (obj instanceof OI0ooi10l) {
/* 9 */                 LinkedHashMap linkedHashMap = ((OI0ooi10l) obj).I00000oIO;
/* 11 */                LinkedHashMap linkedHashMap2 = this.I00000oIO;
/* 14 */                if (linkedHashMap != linkedHashMap2) {
/* 25 */                    if (linkedHashMap.size() == linkedHashMap2.size()) {
/* 32 */                        if (!linkedHashMap.isEmpty()) {
/* 47 */                            for (Map.Entry entry : linkedHashMap.entrySet()) {
/* 59 */                                Object obj2 = linkedHashMap2.get(entry.getKey());
/* 63 */                                if (obj2 != null) {
/* 65 */                                    Object value = entry.getValue();
/* 94 */                                    boolean zI0000O = value instanceof byte[] ? (obj2 instanceof byte[]) && Arrays.equals((byte[]) value, (byte[]) obj2) : O0000Ioio00.I0000O(value, obj2);
/* 95 */                                    if (!zI0000O) {
                                            }
                                        }
                                    }
                                }
                            }
                        }
/* 13 */                return true;
                    }
/* 3 */             return false;
                }

                public final int hashCode() {
/* 9 */             Iterator it = this.I00000oIO.entrySet().iterator();
/* 13 */            int iHashCode = 0;
/* 18 */            while (it.hasNext()) {
/* 26 */                Object value = ((Map.Entry) it.next()).getValue();
/* 45 */                iHashCode += value instanceof byte[] ? Arrays.hashCode((byte[]) value) : value.hashCode();
                    }
/* 55 */            return iHashCode;
                }

                public final String toString() {
/* 25 */            return IOOi0Ool1i.I00IlilI0i0i(this.I00000oIO.entrySet(), ",\n", "{\n", "\n}", new O1o0i0Ol0Oo0(17), 24);
                }

/* 23 */        public OI0ooi10l(boolean z) {
/* 25 */            this(new LinkedHashMap(), z);
                }
            }
