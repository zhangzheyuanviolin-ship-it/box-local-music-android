            package p000;

            import java.util.Map;
            
/* 5 */     public abstract class iI0iO0iloii implements Map.Entry {
                public final int I00iOIl;

                @Override
                public final boolean equals(Object obj) {
                    switch (this.I00iOIl) {
                        case 0:
/* 232 */                   if (obj instanceof Map.Entry) {
/* 234 */                       Map.Entry entry = (Map.Entry) obj;
/* 248 */                       if (ll0o0IOO.I00000oIO(getKey(), entry.getKey()) && ll0o0IOO.I00000oIO(getValue(), entry.getValue())) {
                                }
                            }
                            break;
                        case 1:
/* 195 */                   if (obj instanceof Map.Entry) {
/* 197 */                       Map.Entry entry2 = (Map.Entry) obj;
/* 211 */                       if (ll1Io11lio.I00000oIO(getKey(), entry2.getKey()) && ll1Io11lio.I00000oIO(getValue(), entry2.getValue())) {
                                }
                            }
                            break;
                        case 2:
/* 158 */                   if (obj instanceof Map.Entry) {
/* 160 */                       Map.Entry entry3 = (Map.Entry) obj;
/* 174 */                       if (ll1Oll0I0o1.I00000oIO(getKey(), entry3.getKey()) && ll1Oll0I0o1.I00000oIO(getValue(), entry3.getValue())) {
                                }
                            }
                            break;
                        case 3:
/* 121 */                   if (obj instanceof Map.Entry) {
/* 123 */                       Map.Entry entry4 = (Map.Entry) obj;
/* 137 */                       if (liioo01Ol.I00000oIO(getKey(), entry4.getKey()) && liioo01Ol.I00000oIO(getValue(), entry4.getValue())) {
                                }
                            }
                            break;
                        case 4:
/* 84 */                    if (obj instanceof Map.Entry) {
/* 86 */                        Map.Entry entry5 = (Map.Entry) obj;
/* 100 */                       if (lil0l1lIi1.I00000oIO(getKey(), entry5.getKey()) && lil0l1lIi1.I00000oIO(getValue(), entry5.getValue())) {
                                }
                            }
                            break;
                        case 5:
/* 47 */                    if (obj instanceof Map.Entry) {
/* 49 */                        Map.Entry entry6 = (Map.Entry) obj;
/* 63 */                        if (lio0iilo.I00000oIO(getKey(), entry6.getKey()) && lio0iilo.I00000oIO(getValue(), entry6.getValue())) {
                                }
                            }
                            break;
                        default:
/* 10 */                    if (obj instanceof Map.Entry) {
/* 12 */                        Map.Entry entry7 = (Map.Entry) obj;
/* 26 */                        if (lioooIIO.I00000oIO(getKey(), entry7.getKey()) && lioooIIO.I00000oIO(getValue(), entry7.getValue())) {
                                }
                            }
                            break;
                    }
/* 4 */             return false;
                }

                @Override
                public final int hashCode() {
                    switch (this.I00iOIl) {
                        case 0:
/* 163 */                   Object key = getKey();
/* 167 */                   Object value = getValue();
/* 186 */                   return (key == null ? 0 : key.hashCode()) ^ (value != null ? value.hashCode() : 0);
                        case 1:
/* 137 */                   Object key2 = getKey();
/* 141 */                   Object value2 = getValue();
/* 160 */                   return (key2 == null ? 0 : key2.hashCode()) ^ (value2 != null ? value2.hashCode() : 0);
                        case 2:
/* 111 */                   Object key3 = getKey();
/* 115 */                   Object value3 = getValue();
/* 134 */                   return (key3 == null ? 0 : key3.hashCode()) ^ (value3 != null ? value3.hashCode() : 0);
                        case 3:
/* 85 */                    Object key4 = getKey();
/* 89 */                    Object value4 = getValue();
/* 108 */                   return (key4 == null ? 0 : key4.hashCode()) ^ (value4 != null ? value4.hashCode() : 0);
                        case 4:
/* 59 */                    Object key5 = getKey();
/* 63 */                    Object value5 = getValue();
/* 82 */                    return (key5 == null ? 0 : key5.hashCode()) ^ (value5 != null ? value5.hashCode() : 0);
                        case 5:
/* 33 */                    Object key6 = getKey();
/* 37 */                    Object value6 = getValue();
/* 56 */                    return (key6 == null ? 0 : key6.hashCode()) ^ (value6 != null ? value6.hashCode() : 0);
                        default:
/* 7 */                     Object key7 = getKey();
/* 11 */                    Object value7 = getValue();
/* 30 */                    return (key7 == null ? 0 : key7.hashCode()) ^ (value7 != null ? value7.hashCode() : 0);
                    }
                }

                public final String toString() {
                    switch (this.I00iOIl) {
                        case 2:
                            break;
                    }
/* 24 */            return IlIi0I0.I000lI(String.valueOf(getKey()), "=", String.valueOf(getValue()));
                }
            }
