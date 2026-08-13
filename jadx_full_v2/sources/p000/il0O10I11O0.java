            package p000;

            import android.hardware.camera2.CameraCharacteristics;
            import android.hardware.camera2.CaptureRequest;
            import android.hardware.camera2.CaptureResult;
            import java.util.ArrayList;
            import java.util.Map;
            
            public abstract class il0O10I11O0 {
                public static void I00000oIO(StringBuilder sb, String str, Map map) {
/* 5 */             if (map.isEmpty()) {
/* 13 */                sb.append(str.concat(": (None)\n"));
/* 16 */                return;
                    }
/* 23 */            sb.append(str.concat("\n"));
/* 32 */            ArrayList arrayList = new ArrayList(map.size());
/* 47 */            for (Map.Entry entry : map.entrySet()) {
/* 55 */                Object key = entry.getKey();
/* 92 */                String name = key instanceof CameraCharacteristics.Key ? ((CameraCharacteristics.Key) key).getName() : key instanceof CaptureRequest.Key ? ((CaptureRequest.Key) key).getName() : key instanceof CaptureResult.Key ? ((CaptureResult.Key) key).getName() : String.valueOf(key);
/* 96 */                Object value = entry.getValue();
/* 135 */               arrayList.add(new OIoi0IIoi(name, value instanceof Object[] ? I1IoiO1l.I001lllioOl((Object[]) value, null, "[", "]", new IO1I11OO(20), 25) : String.valueOf(value)));
                    }
/* 160 */           for (OIoi0IIoi oIoi0IIoi : IOOi0Ool1i.I00Ol1ll1(arrayList, new IliIiio1(14))) {
/* 209 */               sb.append("  " + OlOoOIi0o.I00II0oii1o(50, (String) oIoi0IIoi.I00iOIl) + ' ' + ((String) oIoi0IIoi.I00iiI) + '\n');
                    }
                }
            }
