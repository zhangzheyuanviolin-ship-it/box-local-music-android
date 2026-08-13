            package p000;
            
            public abstract class lOIOiI11oo {
                public static void I00000oIO(Olil1OioO olil1OioO, Object[] objArr) {
/* 1 */             if (objArr == null) {
/* 332 */               return;
                    }
/* 5 */             int length = objArr.length;
/* 6 */             int i = 0;
/* 7 */             while (i < length) {
/* 9 */                 Object obj = objArr[i];
/* 11 */                i++;
/* 13 */                if (obj == null) {
/* 15 */                    olil1OioO.I000o00OoI0I(i);
                        } else if (obj instanceof byte[]) {
/* 25 */                    olil1OioO.I000iOII(i, (byte[]) obj);
                        } else if (obj instanceof Float) {
/* 40 */                    olil1OioO.I000OOo1O(i, ((Number) obj).floatValue());
                        } else if (obj instanceof Double) {
/* 54 */                    olil1OioO.I000OOo1O(i, ((Number) obj).doubleValue());
                        } else if (obj instanceof Long) {
/* 68 */                    olil1OioO.I000OiO(i, ((Number) obj).longValue());
                        } else if (obj instanceof Integer) {
/* 83 */                    olil1OioO.I000OiO(i, ((Number) obj).intValue());
                        } else if (obj instanceof Short) {
/* 98 */                    olil1OioO.I000OiO(i, ((Number) obj).shortValue());
                        } else if (obj instanceof Byte) {
/* 113 */                   olil1OioO.I000OiO(i, ((Number) obj).byteValue());
                        } else if (obj instanceof String) {
/* 123 */                   olil1OioO.I001i1O0Ol(i, (String) obj);
                        } else {
/* 129 */                   if (!(obj instanceof Boolean)) {
/* 181 */                       throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
                            }
/* 144 */                   olil1OioO.I000OiO(i, ((Boolean) obj).booleanValue() ? 1L : 0L);
                        }
                    }
                }
            }
