            package com.google.ai.edge.gallery.customtasks.mobileactions;

            import com.google.ai.edge.litertlm.Tool;
            import com.google.ai.edge.litertlm.ToolParam;
            import com.google.ai.edge.litertlm.ToolSet;
            import java.lang.invoke.VarHandle;
            import java.util.Collections;
            import java.util.Map;
            import kotlin.Metadata;
            import kotlin.jvm.functions.Function1;
            import p000.I0I1ll0io;
            import p000.IOOi1I;
            import p000.IOOiio0i;
            import p000.Ii01oIl1;
            import p000.Ii01oi;
            import p000.IiOooilIoiIi;
            import p000.Il01100l;
            import p000.IlOI1I0O;
            import p000.IlOI1Oi;
            import p000.IlllIOo0OI;
            import p000.IoiOo1iI;
            import p000.O1Oii0O0loo;
            import p000.OIi0oo1OlOO;
            import p000.OIi11lil1il;
            import p000.OIi1OoloO;
            import p000.OIi1i0i;
            import p000.OIoi0IIoi;
            import p000.OO0Ii1;
            import p000.Oil1IliI;
            import p000.Oil1OoIoOill;
            import p000.OiloliOO;
            import p000.Oio0l1O0ioi;
            import p000.Ol01Iol0li;
            import p000.OlI00IIlOO;
            import p000.Ooo1iOO;
            import p000.iOIiI1OOol;
            import p000.iOOooloI;
            import p000.iOiiOoo;
            import p000.ilI11io0O0Il;
            import p000.ilOi11Ilo;
            import p000.ilOi1lOil1;
            import p000.l0lolo;
            import p000.l11l1IooiIo1;
            import p000.lI010lI;
            import p000.lI0IIIi0il;
            import p000.lOIlOiiO0o1;
            import p000.lOlo100OII;
            import p000.li1oiOOloO1;
            import p000.liI1O0I1O0;
            
            @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0013\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\bH\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\bH\u0007¢\u0006\u0004\b\f\u0010\u000bJC\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010\r\u001a\u00020\t2\b\b\u0001\u0010\u000e\u001a\u00020\t2\b\b\u0001\u0010\u000f\u001a\u00020\t2\b\b\u0001\u0010\u0010\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J9\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010\u0013\u001a\u00020\t2\b\b\u0001\u0010\u0014\u001a\u00020\t2\b\b\u0001\u0010\u0015\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0016\u0010\u0017J%\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010\u0018\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u001b\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\bH\u0007¢\u0006\u0004\b\u001b\u0010\u000bJ/\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010\u001c\u001a\u00020\t2\b\b\u0001\u0010\u001d\u001a\u00020\tH\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ9\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010!\u001a\u00020 2\b\b\u0001\u0010\"\u001a\u00020 2\b\b\u0001\u0010#\u001a\u00020\tH\u0007¢\u0006\u0004\b$\u0010%J/\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010&\u001a\u00020 2\b\b\u0001\u0010#\u001a\u00020\tH\u0007¢\u0006\u0004\b'\u0010(J%\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010\u000f\u001a\u00020\tH\u0007¢\u0006\u0004\b)\u0010\u001aJ/\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010\u000f\u001a\u00020\t2\b\b\u0001\u0010*\u001a\u00020\tH\u0007¢\u0006\u0004\b+\u0010\u001fJ%\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010,\u001a\u00020\tH\u0007¢\u0006\u0004\b-\u0010\u001aJ\u001b\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\bH\u0007¢\u0006\u0004\b.\u0010\u000bJ\u001b\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\bH\u0007¢\u0006\u0004\b/\u0010\u000bR#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00100\u001a\u0004\b1\u00102¨\u00063"}, d2 = {"Lcom/google/ai/edge/gallery/customtasks/mobileactions/MobileActionsTools;", "Lcom/google/ai/edge/litertlm/ToolSet;", "Lkotlin/Function1;", "LI0I0i1;", "LOoiIlOl1iI;", "onFunctionCalled", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "", "", "turnOnFlashlight", "()Ljava/util/Map;", "turnOffFlashlight", "firstName", "lastName", "phoneNumber", "email", "createContact", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;", "to", "subject", "body", "sendEmail", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;", "location", "showLocationOnMap", "(Ljava/lang/String;)Ljava/util/Map;", "openWifiSettings", "datetime", "title", "createCalendarEvent", "(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;", "", "hour", "minute", "label", "setAlarm", "(IILjava/lang/String;)Ljava/util/Map;", "lengthSeconds", "setTimer", "(ILjava/lang/String;)Ljava/util/Map;", "dialNumber", "message", "sendSms", "url", "openUrl", "openBluetoothSettings", "openSoundSettings", "Lkotlin/jvm/functions/Function1;", "getOnFunctionCalled", "()Lkotlin/jvm/functions/Function1;", "app"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
            public final class MobileActionsTools implements ToolSet {
                public static final int $stable = 0;
                private final Function1 onFunctionCalled;

                public MobileActionsTools(Function1 function1) {
/* 4 */             this.onFunctionCalled = function1;
                }

                @Tool(description = "Create calendar event")
                public final Map<String, String> createCalendarEvent(@ToolParam(description = "Datetime YYYY-MM-DDTHH:MM:SS") String datetime, @ToolParam(description = "Title") String title) {
/* 1 */             Function1 function1 = this.onFunctionCalled;
/* 5 */             I0I1ll0io[] i0I1ll0ioArr = I0I1ll0io.I00iOIl;
/* 7 */             iOiiOoo.I00000oIO();
/* 39 */            Ii01oIl1 ii01oIl1 = new Ii01oIl1(new IlllIOo0OI("createCalendarEvent", IOOi1I.I000O01llI0(new OIoi0IIoi("datetime", datetime), new OIoi0IIoi("title", title))));
/* 42 */            ii01oIl1.I00000oOI = datetime;
/* 44 */            ii01oIl1.I0000Il00O = title;
/* 46 */            VarHandle.storeStoreFence();
/* 49 */            function1.invoke(ii01oIl1);
/* 75 */            return O1Oii0O0loo.I0000O(new OIoi0IIoi("result", "success"), new OIoi0IIoi("datetime", datetime), new OIoi0IIoi("title", title));
                }

                @Tool(description = "Add contact")
                public final Map<String, String> createContact(@ToolParam(description = "First name") String firstName, @ToolParam(description = "Last name") String lastName, @ToolParam(description = "Phone number") String phoneNumber, @ToolParam(description = "Email") String email) {
/* 1 */             Function1 function1 = this.onFunctionCalled;
/* 5 */             I0I1ll0io[] i0I1ll0ioArr = I0I1ll0io.I00iOIl;
/* 7 */             lI010lI.I00000oIO();
/* 53 */            Ii01oi ii01oi = new Ii01oi(new IlllIOo0OI("createContact", IOOi1I.I000O01llI0(new OIoi0IIoi("firstName", firstName), new OIoi0IIoi("lastName", lastName), new OIoi0IIoi("phoneNumber", phoneNumber), new OIoi0IIoi("email", email))));
/* 56 */            ii01oi.I00000oOI = firstName;
/* 58 */            ii01oi.I0000Il00O = lastName;
/* 60 */            ii01oi.I0000O = phoneNumber;
/* 62 */            ii01oi.I0000oI00 = email;
/* 64 */            VarHandle.storeStoreFence();
/* 67 */            function1.invoke(ii01oi);
/* 109 */           return O1Oii0O0loo.I0000O(new OIoi0IIoi("result", "success"), new OIoi0IIoi("first_name", firstName), new OIoi0IIoi("last_name", lastName), new OIoi0IIoi("phone_number", phoneNumber), new OIoi0IIoi("email", email));
                }

                @Tool(description = "Dial phone number")
                public final Map<String, String> dialNumber(@ToolParam(description = "Phone number") String phoneNumber) {
/* 1 */             Function1 function1 = this.onFunctionCalled;
/* 5 */             I0I1ll0io[] i0I1ll0ioArr = I0I1ll0io.I00iOIl;
/* 7 */             lI0IIIi0il.I00000oIO();
/* 28 */            IiOooilIoiIi iiOooilIoiIi = new IiOooilIoiIi(new IlllIOo0OI("dialNumber", Collections.singletonList(new OIoi0IIoi("phoneNumber", phoneNumber))));
/* 31 */            iiOooilIoiIi.I00000oOI = phoneNumber;
/* 33 */            VarHandle.storeStoreFence();
/* 36 */            function1.invoke(iiOooilIoiIi);
/* 57 */            return O1Oii0O0loo.I0000O(new OIoi0IIoi("result", "success"), new OIoi0IIoi("phoneNumber", phoneNumber));
                }

                public final Function1 getOnFunctionCalled() {
/* 1 */             return this.onFunctionCalled;
                }

                @Tool(description = "Open Bluetooth settings")
                public final Map<String, String> openBluetoothSettings() {
/* 1 */             Function1 function1 = this.onFunctionCalled;
/* 5 */             I0I1ll0io[] i0I1ll0ioArr = I0I1ll0io.I00iOIl;
/* 7 */             iOOooloI.I00000oIO();
/* 22 */            function1.invoke(new OIi0oo1OlOO(new IlllIOo0OI("openBluetoothSettings", Il01100l.I00iOIl)));
/* 29 */            return Collections.singletonMap("result", "success");
                }

                @Tool(description = "Open sound settings")
                public final Map<String, String> openSoundSettings() {
/* 1 */             Function1 function1 = this.onFunctionCalled;
/* 5 */             I0I1ll0io[] i0I1ll0ioArr = I0I1ll0io.I00iOIl;
/* 7 */             li1oiOOloO1.I00000oIO();
/* 22 */            function1.invoke(new OIi11lil1il(new IlllIOo0OI("openSoundSettings", Il01100l.I00iOIl)));
/* 29 */            return Collections.singletonMap("result", "success");
                }

                @Tool(description = "Open URL in browser")
                public final Map<String, String> openUrl(@ToolParam(description = "URL with scheme") String url) {
/* 1 */             Function1 function1 = this.onFunctionCalled;
/* 5 */             I0I1ll0io[] i0I1ll0ioArr = I0I1ll0io.I00iOIl;
/* 7 */             l0lolo.I00000oIO();
/* 28 */            OIi1OoloO oIi1OoloO = new OIi1OoloO(new IlllIOo0OI("openUrl", Collections.singletonList(new OIoi0IIoi("url", url))));
/* 31 */            oIi1OoloO.I00000oOI = url;
/* 33 */            VarHandle.storeStoreFence();
/* 36 */            function1.invoke(oIi1OoloO);
/* 57 */            return O1Oii0O0loo.I0000O(new OIoi0IIoi("result", "success"), new OIoi0IIoi("url", url));
                }

                @Tool(description = "Open WiFi settings")
                public final Map<String, String> openWifiSettings() {
/* 1 */             Function1 function1 = this.onFunctionCalled;
/* 5 */             I0I1ll0io[] i0I1ll0ioArr = I0I1ll0io.I00iOIl;
/* 7 */             liI1O0I1O0.I00000oIO();
/* 22 */            function1.invoke(new OIi1i0i(new IlllIOo0OI("openWifiSettings", Il01100l.I00iOIl)));
/* 29 */            return Collections.singletonMap("result", "success");
                }

                @Tool(description = "Send email")
                public final Map<String, String> sendEmail(@ToolParam(description = "Recipient email") String to, @ToolParam(description = "Subject") String subject, @ToolParam(description = "Body") String body) {
/* 1 */             Function1 function1 = this.onFunctionCalled;
/* 5 */             I0I1ll0io[] i0I1ll0ioArr = I0I1ll0io.I00iOIl;
/* 7 */             ilI11io0O0Il.I00000oIO();
/* 46 */            Oil1IliI oil1IliI = new Oil1IliI(new IlllIOo0OI("sendEmail", IOOi1I.I000O01llI0(new OIoi0IIoi("to", to), new OIoi0IIoi("subject", subject), new OIoi0IIoi("body", body))));
/* 49 */            oil1IliI.I00000oOI = to;
/* 51 */            oil1IliI.I0000Il00O = subject;
/* 53 */            oil1IliI.I0000O = body;
/* 55 */            VarHandle.storeStoreFence();
/* 58 */            function1.invoke(oil1IliI);
/* 89 */            return O1Oii0O0loo.I0000O(new OIoi0IIoi("result", "success"), new OIoi0IIoi("to", to), new OIoi0IIoi("subject", subject), new OIoi0IIoi("body", body));
                }

                @Tool(description = "Send SMS")
                public final Map<String, String> sendSms(@ToolParam(description = "Phone number") String phoneNumber, @ToolParam(description = "Message") String message) {
/* 1 */             Function1 function1 = this.onFunctionCalled;
/* 5 */             I0I1ll0io[] i0I1ll0ioArr = I0I1ll0io.I00iOIl;
/* 7 */             lOIlOiiO0o1.I00000oIO();
/* 39 */            Oil1OoIoOill oil1OoIoOill = new Oil1OoIoOill(new IlllIOo0OI("sendSms", IOOi1I.I000O01llI0(new OIoi0IIoi("phoneNumber", phoneNumber), new OIoi0IIoi("message", message))));
/* 42 */            oil1OoIoOill.I00000oOI = phoneNumber;
/* 44 */            oil1OoIoOill.I0000Il00O = message;
/* 46 */            VarHandle.storeStoreFence();
/* 49 */            function1.invoke(oil1OoIoOill);
/* 75 */            return O1Oii0O0loo.I0000O(new OIoi0IIoi("result", "success"), new OIoi0IIoi("phoneNumber", phoneNumber), new OIoi0IIoi("message", message));
                }

                @Tool(description = "Set alarm")
                public final Map<String, String> setAlarm(@ToolParam(description = "Hour 0-23") int hour, @ToolParam(description = "Minute 0-59") int minute, @ToolParam(description = "Label") String label) {
/* 1 */             Function1 function1 = this.onFunctionCalled;
/* 5 */             I0I1ll0io[] i0I1ll0ioArr = I0I1ll0io.I00iOIl;
/* 7 */             iOIiI1OOol.I00000oIO();
/* 54 */            OiloliOO oiloliOO = new OiloliOO(new IlllIOo0OI("setAlarm", IOOi1I.I000O01llI0(new OIoi0IIoi("hour", String.valueOf(hour)), new OIoi0IIoi("minute", String.valueOf(minute)), new OIoi0IIoi("label", label))));
/* 57 */            oiloliOO.I00000oOI = hour;
/* 59 */            oiloliOO.I0000Il00O = minute;
/* 61 */            oiloliOO.I0000O = label;
/* 63 */            VarHandle.storeStoreFence();
/* 66 */            function1.invoke(oiloliOO);
/* 100 */           return O1Oii0O0loo.I0000O(new OIoi0IIoi("result", "success"), new OIoi0IIoi("hour", String.valueOf(hour)), new OIoi0IIoi("minute", String.valueOf(minute)));
                }

                @Tool(description = "Set countdown timer")
                public final Map<String, String> setTimer(@ToolParam(description = "Duration seconds") int lengthSeconds, @ToolParam(description = "Label") String label) {
/* 1 */             Function1 function1 = this.onFunctionCalled;
/* 5 */             I0I1ll0io[] i0I1ll0ioArr = I0I1ll0io.I00iOIl;
/* 7 */             lOlo100OII.I00000oIO();
/* 43 */            Oio0l1O0ioi oio0l1O0ioi = new Oio0l1O0ioi(new IlllIOo0OI("setTimer", IOOi1I.I000O01llI0(new OIoi0IIoi("lengthSeconds", String.valueOf(lengthSeconds)), new OIoi0IIoi("label", label))));
/* 46 */            oio0l1O0ioi.I00000oOI = lengthSeconds;
/* 48 */            oio0l1O0ioi.I0000Il00O = label;
/* 50 */            VarHandle.storeStoreFence();
/* 53 */            function1.invoke(oio0l1O0ioi);
/* 78 */            return O1Oii0O0loo.I0000O(new OIoi0IIoi("result", "success"), new OIoi0IIoi("lengthSeconds", String.valueOf(lengthSeconds)));
                }

                @Tool(description = "Show location on map")
                public final Map<String, String> showLocationOnMap(@ToolParam(description = "Place name or address") String location) {
/* 1 */             Function1 function1 = this.onFunctionCalled;
/* 5 */             I0I1ll0io[] i0I1ll0ioArr = I0I1ll0io.I00iOIl;
/* 7 */             l11l1IooiIo1.I00000oIO();
/* 28 */            Ol01Iol0li ol01Iol0li = new Ol01Iol0li(new IlllIOo0OI("showLocationOnMap", Collections.singletonList(new OIoi0IIoi("location", location))));
/* 31 */            ol01Iol0li.I00000oOI = location;
/* 33 */            VarHandle.storeStoreFence();
/* 36 */            function1.invoke(ol01Iol0li);
/* 57 */            return O1Oii0O0loo.I0000O(new OIoi0IIoi("result", "success"), new OIoi0IIoi("location", location));
                }

                @Tool(description = "Turn off flashlight")
                public final Map<String, String> turnOffFlashlight() {
/* 1 */             Function1 function1 = this.onFunctionCalled;
/* 5 */             I0I1ll0io[] i0I1ll0ioArr = I0I1ll0io.I00iOIl;
/* 9 */             if (ilOi11Ilo.I00000oIO == null) {
/* 31 */                IoiOo1iI ioiOo1iI = new IoiOo1iI("Outlined.FlashOff", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
/* 34 */                int i = Ooo1iOO.I00000oIO;
/* 40 */                OlI00IIlOO olI00IIlOO = new OlI00IIlOO(IOOiio0i.I00000oOI);
/* 45 */                OO0Ii1 oO0Ii1 = new OO0Ii1();
/* 52 */                oO0Ii1.I000OiO(17.0f, 10.0f);
/* 58 */                oO0Ii1.I000II(-3.61f);
/* 64 */                oO0Ii1.I000OOo1O(2.28f, 2.28f);
/* 67 */                oO0Ii1.I0000Il00O();
/* 72 */                oO0Ii1.I000OiO(17.0f, 2.0f);
/* 77 */                oO0Ii1.I000O01llI0(7.0f, 2.0f);
/* 83 */                oO0Ii1.I000oI1ioi(1.61f);
/* 89 */                oO0Ii1.I000OOo1O(6.13f, 6.13f);
/* 92 */                oO0Ii1.I0000Il00O();
/* 101 */               oO0Ii1.I000OiO(3.41f, 2.86f);
/* 107 */               oO0Ii1.I000O01llI0(2.0f, 4.27f);
/* 112 */               oO0Ii1.I000OOo1O(5.0f, 5.0f);
/* 117 */               oO0Ii1.I000O01llI0(7.0f, 13.0f);
/* 122 */               oO0Ii1.I000II(3.0f);
/* 127 */               oO0Ii1.I000oI1ioi(9.0f);
/* 136 */               oO0Ii1.I000OOo1O(3.58f, -6.15f);
/* 144 */               oO0Ii1.I000O01llI0(17.73f, 20.0f);
/* 153 */               oO0Ii1.I000OOo1O(1.41f, -1.41f);
/* 156 */               oO0Ii1.I0000Il00O();
/* 162 */               IoiOo1iI.I00000oOI(ioiOo1iI, oO0Ii1.I00000oIO, 0, olI00IIlOO);
/* 169 */               ilOi11Ilo.I00000oIO = ioiOo1iI.I0000O();
                    }
/* 183 */           function1.invoke(new IlOI1I0O(new IlllIOo0OI("turnOffFlashlight", Il01100l.I00iOIl)));
/* 190 */           return Collections.singletonMap("result", "success");
                }

                @Tool(description = "Turn on flashlight")
                public final Map<String, String> turnOnFlashlight() {
/* 1 */             Function1 function1 = this.onFunctionCalled;
/* 5 */             I0I1ll0io[] i0I1ll0ioArr = I0I1ll0io.I00iOIl;
/* 7 */             ilOi1lOil1.I00000oIO();
/* 22 */            function1.invoke(new IlOI1Oi(new IlllIOo0OI("turnOnFlashlight", Il01100l.I00iOIl)));
/* 29 */            return Collections.singletonMap("result", "success");
                }
            }
