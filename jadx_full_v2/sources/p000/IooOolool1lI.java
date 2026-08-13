            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class IooOolool1lI {
                public static final liIoOiiO1Oi I00iiI;
                public static final IooOolool1lI[] I00iiO;
                public static final Il0li01oOil I00iio;
                public final String I00iOIl;

                static {
/* 61 */            IooOolool1lI[] iooOolool1lIArr = {new IooOolool1lI("SEND_EMAIL", 0, "send_email"), new IooOolool1lI("SEND_SMS", 1, "send_sms"), new IooOolool1lI("CREATE_CALENDAR_EVENT", 2, "create_calendar_event"), new IooOolool1lI("READ_CALENDAR_EVENTS", 3, "read_calendar_events"), new IooOolool1lI("GET_CURRENT_DATE_AND_TIME", 4, "get_current_date_and_time"), new IooOolool1lI("SCHEDULE_NOTIFICATION", 5, "schedule_notification")};
/* 65 */            I00iiO = iooOolool1lIArr;
/* 71 */            I00iio = ilIII1o11.I00000oIO(iooOolool1lIArr);
/* 80 */            I00iiI = new liIoOiiO1Oi(12);
                }

                public IooOolool1lI(String str, int i, String str2) {
/* 4 */             this.I00iOIl = str2;
                }

                public static IooOolool1lI valueOf(String str) {
/* 7 */             return (IooOolool1lI) Enum.valueOf(IooOolool1lI.class, str);
                }

                public static IooOolool1lI[] values() {
/* 7 */             return (IooOolool1lI[]) I00iiO.clone();
                }
            }
