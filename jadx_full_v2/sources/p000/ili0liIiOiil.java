            package p000;

            import android.graphics.PointF;
            import android.graphics.Rect;
            import android.hardware.camera2.params.MeteringRectangle;
            import android.util.Rational;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            
            public abstract class ili0liIiOiil {
                public static List I00000oIO(List list, int i, Rect rect, Rational rational, int i2, O1ll0I0i0OO o1ll0I0i0OO) {
                    PointF pointF;
/* 9 */             if (list.isEmpty() || i == 0) {
/* 317 */               return Il01100l.I00iOIl;
                    }
/* 17 */            ArrayList arrayList = new ArrayList();
/* 30 */            Rational rational2 = new Rational(rect.width(), rect.height());
/* 33 */            Iterator it = list.iterator();
/* 41 */            while (it.hasNext()) {
/* 47 */                O1liloIo o1liloIo = (O1liloIo) it.next();
/* 53 */                if (arrayList.size() >= i) {
                            break;
                        }
/* 57 */                float f = o1liloIo.I00000oIO;
/* 62 */                if (f >= 0.0f && f <= 1.0f) {
/* 70 */                    float f2 = o1liloIo.I00000oOI;
/* 74 */                    if (f2 >= 0.0f && f2 <= 1.0f) {
/* 80 */                        Rational rational3 = o1liloIo.I0000O;
/* 82 */                        if (rational3 == null) {
/* 84 */                            rational3 = rational;
                                }
/* 90 */                        PointF pointFI000II = o1ll0I0i0OO.I000II(o1liloIo, i2);
/* 98 */                        if (rational3.equals(rational2)) {
/* 190 */                           pointF = new PointF(pointFI000II.x, pointFI000II.y);
                                } else if (rational3.compareTo(rational2) > 0) {
/* 116 */                           pointF = new PointF(pointFI000II.x, pointFI000II.y);
/* 131 */                           float fDoubleValue = (float) (rational3.doubleValue() / rational2.doubleValue());
/* 143 */                           pointF.y = (1.0f / fDoubleValue) * (((float) ((fDoubleValue - 1.0d) / 2.0d)) + pointF.y);
                                } else {
/* 156 */                           pointF = new PointF(pointFI000II.x, pointFI000II.y);
/* 169 */                           float fDoubleValue2 = (float) (rational2.doubleValue() / rational3.doubleValue());
/* 181 */                           pointF.x = (1.0f / fDoubleValue2) * (((float) ((fDoubleValue2 - 1.0d) / 2.0d)) + pointF.x);
                                }
/* 193 */                       float f3 = o1liloIo.I0000Il00O;
/* 207 */                       int iWidth = (int) ((pointF.x * rect.width()) + rect.left);
/* 220 */                       int iHeight = (int) ((pointF.y * rect.height()) + rect.top);
/* 237 */                       int iWidth2 = ((int) (rect.width() * f3)) / 2;
/* 241 */                       int iHeight2 = ((int) (f3 * rect.height())) / 2;
/* 247 */                       Rect rect2 = new Rect(iWidth - iWidth2, iHeight - iHeight2, iWidth + iWidth2, iHeight + iHeight2);
/* 260 */                       rect2.left = lIiioliIlo.I0000Il00O(rect2.left, rect.left, rect.right);
/* 272 */                       rect2.right = lIiioliIlo.I0000Il00O(rect2.right, rect.left, rect.right);
/* 284 */                       rect2.top = lIiioliIlo.I0000Il00O(rect2.top, rect.top, rect.bottom);
/* 296 */                       rect2.bottom = lIiioliIlo.I0000Il00O(rect2.bottom, rect.top, rect.bottom);
/* 305 */                       arrayList.add(new MeteringRectangle(rect2, 1000));
                            }
                        }
                    }
/* 316 */           return arrayList;
                }
            }
