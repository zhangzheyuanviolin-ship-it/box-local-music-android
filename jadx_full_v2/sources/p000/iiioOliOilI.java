            package p000;

            import java.nio.ByteBuffer;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.Map;
            import java.util.regex.Pattern;
            
            public abstract class iiioOliOilI {
                public static final Pattern I00000oIO = Pattern.compile("(angle_\\(samsung_xclipse_[0-9]*\\)_on_vulkan).*$");

                public static final boolean I00000oIO(iiO01011O iio01011o, iiOiIO0ooI0 iioiio0ooi0, l0lIilo1 l0liilo1) {
/* 3 */             HashMap map = new HashMap();
/* 10 */            map.put("tflite.android_sdk_version", iio01011o.I00000oIO);
/* 17 */            map.put("tflite.device_model", iio01011o.I00000oOI);
/* 24 */            map.put("tflite.device_name", iio01011o.I0000Il00O);
/* 31 */            map.put("tflite.manufacturer", iio01011o.I0000O);
/* 38 */            map.put("tflite.gpu_model", iioiio0ooi0.I00000oIO);
/* 77 */            map.put("tflite.opengl_es_version", Integer.toString(iioiio0ooi0.I00000oOI, 10) + "." + Integer.toString(iioiio0ooi0.I0000Il00O, 10));
/* 84 */            Iterator it = map.entrySet().iterator();
                    while (true) {
/* 92 */                int i = 0;
/* 93 */                if (!it.hasNext()) {
                            break;
                        }
/* 99 */                Map.Entry entry = (Map.Entry) it.next();
/* 111 */               String strReplaceAll = ((String) entry.getValue()).replaceAll("[ -]", "_");
/* 115 */               int length = strReplaceAll.length();
                        while (true) {
/* 119 */                   if (i >= length) {
                                break;
                            }
/* 121 */                   char cCharAt = strReplaceAll.charAt(i);
/* 127 */                   if (cCharAt < 'A' || cCharAt > 'Z') {
/* 158 */                       i++;
                            } else {
/* 133 */                       char[] charArray = strReplaceAll.toCharArray();
/* 137 */                       while (i < length) {
/* 139 */                           char c = charArray[i];
/* 141 */                           if (c >= 'A' && c <= 'Z') {
/* 148 */                               charArray[i] = (char) (c ^ ' ');
                                    }
/* 150 */                           i++;
                                }
/* 153 */                       strReplaceAll = String.valueOf(charArray);
                            }
                        }
/* 171 */               if (((String) entry.getKey()).equals("tflite.gpu_model")) {
/* 181 */                   strReplaceAll = I00000oIO.matcher(strReplaceAll).replaceAll("$1");
                        }
/* 185 */               entry.setValue(strReplaceAll);
                    }
/* 189 */           int i2 = 0;
                    while (true) {
/* 191 */               int iI0000O = l0liilo1.I0000O(4);
/* 204 */               if (i2 >= (iI0000O != 0 ? l0liilo1.I000O01llI0(iI0000O) : 0)) {
                            break;
                        }
/* 208 */               l0lIilo1 l0liilo12 = new l0lIilo1(1);
/* 211 */               int iI0000O2 = l0liilo1.I0000O(4);
/* 215 */               if (iI0000O2 != 0) {
/* 223 */                   int iI000II = (i2 * 4) + l0liilo1.I000II(iI0000O2);
/* 237 */                   l0liilo12.I000OiO(((ByteBuffer) l0liilo1.I00iiI).getInt(iI000II) + iI000II, (ByteBuffer) l0liilo1.I00iiI);
                        } else {
/* 241 */                   l0liilo12 = null;
                        }
/* 242 */               lilOo1.I00000oIO(l0liilo12, map);
/* 245 */               i2++;
                    }
/* 254 */           String str = (String) map.get("tflite.gpu.status");
                    return str != null && str.equals("SUPPORTED");
                }
            }
