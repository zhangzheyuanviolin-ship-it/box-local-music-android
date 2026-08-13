            package com.google.ai.edge.litertlm;

            import java.io.Serializable;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.List;
            import java.util.Map;
            import kotlin.Metadata;
            import p000.IOOi1I;
            import p000.O01I0il01001;
            import p000.O01O10Ii;
            import p000.O01iIOolI;
            import p000.O01l0lO0li;
            import p000.O01li1IO;
            import p000.O100O1O;
            import p000.O100Oo;
            import p000.O100iii0I0i;
            import p000.O100l1;
            import p000.OoiIlOl1iI;
            
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a!\u0010\u0004\u001a\u00020\u0003*\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0015\u0010\u0007\u001a\u00020\u0006*\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a!\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0000*\u00020\u0003H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0002*\u00020\u0006H\u0000¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"", "", "", "LO01l0lO0li;", "toJsonObject", "(Ljava/util/Map;)LO01l0lO0li;", "LO01O10Ii;", "toJsonElement", "(Ljava/lang/Object;)LO01O10Ii;", "toMap", "(LO01l0lO0li;)Ljava/util/Map;", "toKotlinValue", "(LO01O10Ii;)Ljava/lang/Object;", "third_party.odml.litert_lm.kotlin.java.com.google.ai.edge.litertlm_litertlm-android"}, m18k = 2, mv = {2, 3, 0}, xi = 48)
            public final class JsonConvertersKt {
                public static final O01O10Ii toJsonElement(Object obj) {
/* 1 */             if (obj == null) {
/* 3 */                 return O01iIOolI.I00iOIl;
                    }
/* 8 */             if (obj instanceof O01O10Ii) {
/* 10 */                return (O01O10Ii) obj;
                    }
/* 15 */            if (obj instanceof Map) {
/* 19 */                O01l0lO0li o01l0lO0li = new O01l0lO0li();
/* 36 */                for (Map.Entry entry : ((Map) obj).entrySet()) {
/* 60 */                    o01l0lO0li.I0000oI00(String.valueOf(entry.getKey()), toJsonElement(entry.getValue()));
                        }
/* 64 */                return o01l0lO0li;
                    }
/* 67 */            if (obj instanceof List) {
/* 71 */                O01I0il01001 o01I0il01001 = new O01I0il01001();
/* 76 */                Iterator it = ((List) obj).iterator();
/* 84 */                while (it.hasNext()) {
/* 94 */                    o01I0il01001.I0000oI00(toJsonElement(it.next()));
                        }
/* 98 */                return o01I0il01001;
                    }
/* 101 */           if (obj instanceof String) {
/* 107 */               O01li1IO o01li1IO = new O01li1IO();
/* 110 */               o01li1IO.I00iOIl = (String) obj;
/* 112 */               return o01li1IO;
                    }
/* 115 */           if (obj instanceof Number) {
/* 121 */               O01li1IO o01li1IO2 = new O01li1IO();
/* 124 */               o01li1IO2.I00iOIl = (Number) obj;
/* 126 */               return o01li1IO2;
                    }
/* 129 */           if (obj instanceof Boolean) {
/* 135 */               O01li1IO o01li1IO3 = new O01li1IO();
/* 138 */               o01li1IO3.I00iOIl = (Boolean) obj;
/* 140 */               return o01li1IO3;
                    }
/* 143 */           if (!(obj instanceof OoiIlOl1iI)) {
/* 161 */               return new O01li1IO(obj.toString());
                    }
/* 147 */           O01li1IO o01li1IO4 = new O01li1IO();
/* 152 */           o01li1IO4.I00iOIl = "";
/* 154 */           return o01li1IO4;
                }

                public static final O01l0lO0li toJsonObject(Map<String, ? extends Object> map) {
/* 3 */             O01l0lO0li o01l0lO0li = new O01l0lO0li();
/* 18 */            for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
/* 40 */                o01l0lO0li.I0000oI00(entry.getKey(), toJsonElement(entry.getValue()));
                    }
/* 77 */            return o01l0lO0li;
                }

                public static final Object toKotlinValue(O01O10Ii o01O10Ii) {
/* 3 */             if (o01O10Ii instanceof O01iIOolI) {
/* 5 */                 return null;
                    }
/* 9 */             if (o01O10Ii instanceof O01l0lO0li) {
/* 15 */                return toMap(o01O10Ii.I00000oOI());
                    }
/* 22 */            if (!(o01O10Ii instanceof O01I0il01001)) {
/* 66 */                if (!(o01O10Ii instanceof O01li1IO)) {
/* 168 */                   return o01O10Ii;
                        }
/* 69 */                O01li1IO o01li1IO = (O01li1IO) o01O10Ii;
/* 71 */                Serializable serializable = o01li1IO.I00iOIl;
                        return serializable instanceof Boolean ? Boolean.valueOf(o01li1IO.I0001Ioi1lo()) : serializable instanceof Number ? o01li1IO.I000OiO() : serializable instanceof String ? o01li1IO.I0000O() : o01O10Ii;
                    }
/* 24 */            O01I0il01001 o01I0il01001 = (O01I0il01001) o01O10Ii;
/* 34 */            ArrayList arrayList = new ArrayList(IOOi1I.I0000O(o01I0il01001, 10));
/* 39 */            Iterator it = o01I0il01001.I00iOIl.iterator();
/* 47 */            while (it.hasNext()) {
/* 59 */                arrayList.add(toKotlinValue((O01O10Ii) it.next()));
                    }
/* 63 */            return arrayList;
                }

                public static final Map<String, Object> toMap(O01l0lO0li o01l0lO0li) {
/* 3 */             LinkedHashMap linkedHashMap = new LinkedHashMap();
/* 14 */            Iterator it = ((O100Oo) o01l0lO0li.I00iOIl.entrySet()).iterator();
/* 25 */            while (((O100iii0I0i) it).hasNext()) {
/* 30 */                O100l1 o100l1I00000oIO = ((O100O1O) it).I00000oIO();
/* 48 */                linkedHashMap.put(o100l1I00000oIO.getKey(), toKotlinValue((O01O10Ii) o100l1I00000oIO.getValue()));
                    }
/* 77 */            return linkedHashMap;
                }
            }
