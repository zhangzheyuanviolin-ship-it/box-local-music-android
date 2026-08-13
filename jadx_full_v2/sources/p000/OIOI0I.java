            package p000;

            import android.app.AlarmManager;
            import android.app.PendingIntent;
            import android.content.Context;
            import android.content.Intent;
            import com.google.ai.edge.gallery.notifications.NotificationReceiver;
            import java.util.ArrayList;
            import java.util.Calendar;
            import java.util.Iterator;
            import java.util.List;
            
            public final class OIOI0I {
                public Context I00000oIO;
                public Ii1I1ooo10O0 I00000oOI;
                public String I0000Il00O;
                public IIOlO1ii I0000O;
                public OlO0OIIl1 I0000oI00;

                public final void I00000oIO(String str) {
                    IOoil1iiIilo iOoil1iiIilo;
                    Object next;
                    Object value;
                    ArrayList arrayList;
/* 1 */             Context context = this.I00000oIO;
/* 3 */             OlO0OIIl1 olO0OIIl1 = this.I0000oI00;
/* 11 */            Iterator it = ((Iterable) olO0OIIl1.getValue()).iterator();
                    while (true) {
/* 19 */                iOoil1iiIilo = null;
/* 20 */                if (it.hasNext()) {
/* 22 */                    next = it.next();
/* 37 */                    if (O0000Ioio00.I0000O(((OiO1o1il0) next).I001i1O0Ol(), str)) {
                                break;
                            }
                        } else {
/* 40 */                    next = null;
                            break;
                        }
                    }
/* 41 */            OiO1o1il0 oiO1o1il0 = (OiO1o1il0) next;
/* 43 */            if (oiO1o1il0 != null) {
/* 45 */                String strI001i1O0Ol = oiO1o1il0.I001i1O0Ol();
/* 49 */                String strI001lllioOl = oiO1o1il0.I001lllioOl();
/* 53 */                String strI001i1lo1io = oiO1o1il0.I001i1lo1io();
/* 57 */                String strI001IIilI0O = oiO1o1il0.I001IIilI0O();
/* 61 */                boolean zI001lIiIIo1O = oiO1o1il0.I001lIiIIo1O();
/* 65 */                int iI001IO000 = oiO1o1il0.I001IO000();
/* 69 */                int iI001iOo1i0O = oiO1o1il0.I001iOo1i0O();
/* 73 */                String strI0010I0i = oiO1o1il0.I0010I0i();
/* 77 */                String strI0010o = oiO1o1il0.I0010o();
/* 81 */                int i = NotificationReceiver.I0000Il00O;
/* 87 */                Intent intent = new Intent(context, (Class<?>) NotificationReceiver.class);
/* 92 */                intent.putExtra("id", strI001i1O0Ol);
/* 97 */                intent.putExtra("title", strI001lllioOl);
/* 102 */               intent.putExtra("message", strI001i1lo1io);
/* 107 */               intent.putExtra("deeplink", strI001IIilI0O);
/* 112 */               intent.putExtra("repeat_daily", zI001lIiIIo1O);
/* 117 */               intent.putExtra("hour", iI001IO000);
/* 122 */               intent.putExtra("minute", iI001iOo1i0O);
/* 127 */               intent.putExtra("channel_id", strI0010I0i);
/* 132 */               intent.putExtra("channel_name", strI0010o);
/* 153 */               ((AlarmManager) context.getSystemService("alarm")).cancel(PendingIntent.getBroadcast(context, strI001i1O0Ol.hashCode(), intent, 201326592));
                    }
/* 205 */           do {
/* 156 */               value = olO0OIIl1.getValue();
/* 167 */               arrayList = new ArrayList();
/* 178 */               for (Object obj : (List) value) {
/* 195 */                   if (!O0000Ioio00.I0000O(((OiO1o1il0) obj).I001i1O0Ol(), str)) {
/* 197 */                       arrayList.add(obj);
                            }
                        }
/* 205 */           } while (!olO0OIIl1.I000iOII(value, arrayList));
/* 216 */           iOi1II01i0.I0000O(this.I0000O, null, null, new O1iOlO(this, iOoil1iiIilo, 2), 3);
                }

                public final void I00000oOI(OiO1o1il0 oiO1o1il0) {
/* 1 */             Context context = this.I00000oIO;
/* 10 */            AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
/* 12 */            String strI001i1O0Ol = oiO1o1il0.I001i1O0Ol();
/* 16 */            String strI001lllioOl = oiO1o1il0.I001lllioOl();
/* 20 */            String strI001i1lo1io = oiO1o1il0.I001i1lo1io();
/* 24 */            String strI001IIilI0O = oiO1o1il0.I001IIilI0O();
/* 28 */            boolean zI001lIiIIo1O = oiO1o1il0.I001lIiIIo1O();
/* 32 */            int iI001IO000 = oiO1o1il0.I001IO000();
/* 36 */            int iI001iOo1i0O = oiO1o1il0.I001iOo1i0O();
/* 40 */            String strI0010I0i = oiO1o1il0.I0010I0i();
/* 44 */            String strI0010o = oiO1o1il0.I0010o();
/* 48 */            int i = NotificationReceiver.I0000Il00O;
/* 54 */            Intent intent = new Intent(context, (Class<?>) NotificationReceiver.class);
/* 59 */            intent.putExtra("id", strI001i1O0Ol);
/* 64 */            intent.putExtra("title", strI001lllioOl);
/* 69 */            intent.putExtra("message", strI001i1lo1io);
/* 74 */            intent.putExtra("deeplink", strI001IIilI0O);
/* 79 */            intent.putExtra("repeat_daily", zI001lIiIIo1O);
/* 84 */            intent.putExtra("hour", iI001IO000);
/* 89 */            intent.putExtra("minute", iI001iOo1i0O);
/* 94 */            intent.putExtra("channel_id", strI0010I0i);
/* 99 */            intent.putExtra("channel_name", strI0010o);
/* 108 */           PendingIntent broadcast = PendingIntent.getBroadcast(context, strI001i1O0Ol.hashCode(), intent, 201326592);
/* 112 */           Calendar calendar = Calendar.getInstance();
/* 120 */           calendar.setTimeInMillis(System.currentTimeMillis());
/* 129 */           if (oiO1o1il0.I00IO1() && oiO1o1il0.I00II0oii1o() && oiO1o1il0.I00II0Ol1O0l()) {
/* 147 */               calendar.set(1, oiO1o1il0.I001lloI());
/* 156 */               calendar.set(2, oiO1o1il0.I001l0I00() - 1);
/* 163 */               calendar.set(5, oiO1o1il0.I00111O());
                    }
/* 172 */           calendar.set(11, oiO1o1il0.I001IO000());
/* 181 */           calendar.set(12, oiO1o1il0.I001iOo1i0O());
/* 187 */           calendar.set(13, 0);
/* 198 */           if (calendar.before(Calendar.getInstance()) && (oiO1o1il0.I001lIiIIo1O() || (!oiO1o1il0.I00IO1() && !oiO1o1il0.I00II0oii1o() && !oiO1o1il0.I00II0Ol1O0l()))) {
/* 224 */               calendar.add(5, 1);
                    }
/* 231 */           if (oiO1o1il0.I001lIiIIo1O()) {
/* 241 */               alarmManager.setRepeating(0, calendar.getTimeInMillis(), 86400000L, broadcast);
                    } else {
/* 249 */               alarmManager.setAndAllowWhileIdle(0, calendar.getTimeInMillis(), broadcast);
                    }
                }
            }
