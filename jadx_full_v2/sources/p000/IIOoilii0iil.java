            package p000;

            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            import java.util.Collection;
            import java.util.Collections;
            import java.util.HashMap;
            import java.util.Map;
            import java.util.Set;
            
            public final class IIOoilii0iil implements Map {
                public IIOoi0ooOoO I00iOIl;
                public HashMap I00iiI;

                public static IIOoilii0iil I00000oIO(IIOoi0ooOoO iIOoi0ooOoO) throws IOException {
                    Object objValueOf;
/* 3 */             HashMap map = new HashMap();
/* 20 */            for (IIi0I0I0o iIi0I0I0o : iIOoi0ooOoO.I00iOIl.keySet()) {
/* 28 */                IIOoOiOI iIOoOiOII00oII = iIOoi0ooOoO.I00oII(iIi0I0I0o);
/* 34 */                if (iIOoOiOII00oII instanceof IIi0l1) {
/* 38 */                    objValueOf = ((IIi0l1) iIOoOiOII00oII).I00ioIO();
                        } else if (iIOoOiOII00oII instanceof IIOool) {
/* 52 */                    objValueOf = Integer.valueOf((int) ((IIOool) iIOoOiOII00oII).I00iOIl);
                        } else if (iIOoOiOII00oII instanceof IIi0I0I0o) {
/* 63 */                    objValueOf = ((IIi0I0I0o) iIOoOiOII00oII).I00iOIl;
                        } else if (iIOoOiOII00oII instanceof IIOolo0l) {
/* 78 */                    objValueOf = Float.valueOf(((IIOolo0l) iIOoOiOII00oII).I00iOIl.floatValue());
                        } else {
/* 85 */                    if (!(iIOoOiOII00oII instanceof IIOoOl1o1)) {
/* 106 */                       IOOlIIilOl0.I000l1("Error:unknown type of object to convert:", iIOoOiOII00oII);
/* 109 */                       return null;
                            }
/* 96 */                    objValueOf = ((IIOoOl1o1) iIOoOiOII00oII).I00iOIl ? Boolean.TRUE : Boolean.FALSE;
                        }
/* 100 */               map.put(iIi0I0I0o.I00iOIl, objValueOf);
                    }
/* 113 */           IIOoilii0iil iIOoilii0iil = new IIOoilii0iil();
/* 116 */           iIOoilii0iil.I00iiI = map;
/* 118 */           iIOoilii0iil.I00iOIl = iIOoi0ooOoO;
/* 120 */           VarHandle.storeStoreFence();
/* 186 */           return iIOoilii0iil;
                }

                @Override
                public final void clear() {
/* 5 */             this.I00iOIl.I00iOIl.clear();
/* 10 */            this.I00iiI.clear();
                }

                @Override
                public final boolean containsKey(Object obj) {
/* 3 */             return this.I00iiI.containsKey(obj);
                }

                @Override
                public final boolean containsValue(Object obj) {
/* 3 */             return this.I00iiI.containsValue(obj);
                }

                @Override
                public final Set entrySet() {
/* 7 */             return Collections.unmodifiableSet(this.I00iiI.entrySet());
                }

                @Override
                public final boolean equals(Object obj) {
/* 3 */             if (obj instanceof IIOoilii0iil) {
/* 11 */                return ((IIOoilii0iil) obj).I00iOIl.equals(this.I00iOIl);
                    }
/* 16 */            return false;
                }

                @Override
                public final Object get(Object obj) {
/* 3 */             return this.I00iiI.get(obj);
                }

                @Override
                public final int hashCode() {
/* 3 */             return this.I00iOIl.hashCode();
                }

                @Override
                public final boolean isEmpty() {
                    return size() == 0;
                }

                @Override
                public final Set keySet() {
/* 3 */             return this.I00iiI.keySet();
                }

                @Override
                public final Object put(Object obj, Object obj2) {
/* 17 */            this.I00iOIl.I010iIIOlo(IIi0I0I0o.I00ioIO((String) obj), ((IIi0O1OOO1i0) obj2).I00Io1lO());
/* 22 */            return this.I00iiI.put(obj, obj2);
                }

                @Override
                public final void putAll(Map map) {
/* 49 */            throw new UnsupportedOperationException("Not yet implemented");
                }

                @Override
                public final Object remove(Object obj) {
/* 10 */            this.I00iOIl.I010II(IIi0I0I0o.I00ioIO((String) obj));
/* 15 */            return this.I00iiI.remove(obj);
                }

                @Override
                public final int size() {
/* 5 */             return this.I00iOIl.I00iOIl.size();
                }

                public final String toString() {
/* 3 */             return this.I00iiI.toString();
                }

                @Override
                public final Collection values() {
/* 3 */             return this.I00iiI.values();
                }
            }
