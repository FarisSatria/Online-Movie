package gg.jte.generated.ondemand.include.modal;
public final class JtebookingGenerated {
	public static final String JTE_NAME = "include/modal/booking.jte";
	public static final int[] JTE_LINE_INFO = {2,2,2,2,2,2,5,30,45,84,99,99,99,99,99,99};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor) {
		jteOutput.writeContent("\n\n");
		jteOutput.writeContent("\n<div id=\"bookingModal\" class=\"fixed inset-0 z-50 hidden bg-black bg-opacity-40 overflow-auto\">\n\n    ");
		jteOutput.writeContent("\n    <div class=\"bg-gray-100 rounded-xl shadow-lg mx-auto my-12 w-full max-w-4xl\">\n        <div class=\"h-14 rounded-t-xl bg-gradient-to-r from-sky-400 to-sky-600\">\n            <span class=\"text-red-500 hover:text-red-600 hover:rotate-12 hover:scale-125 hover:drop-shadow-lg transition duration-200 p-3 mr-4 text-3xl font-bold float-right cursor-pointer close drop-shadow-md\">&times;</span>\n        </div>\n        <div class=\"main flex flex-col md:flex-row p-6 w-full\">\n            <div class=\"tickets w-full md:w-2/4 drop-shadow-md\">\n                <h2 class=\"text-xl text-center font-semibold mb-4 text-gray-800\">Select Your Seats</h2>\n                <div class=\"ticket-selector bg-white flex flex-col items-center p-6 rounded-md\">\n                    <div class=\"seats w-full flex flex-col items-center justify-center relative\">\n                        <div class=\"status w-full flex items-center justify-evenly mb-4\">\n                            <div class=\"item text-sm flex items-center space-x-2 relative\">\n                                <span class=\"w-3.5 h-3.5 bg-red-400 rounded-md\"></span>\n                                <span>Available</span>\n                            </div>\n                            <div class=\"item text-sm flex items-center space-x-2 relative\">\n                                <span class=\"w-3.5 h-3.5 bg-[#b4b4b4] border-none rounded-md\"></span>\n                                <span>Booked</span>\n                            </div>\n                            <div class=\"item text-sm flex items-center space-x-2 relative\">\n                                <span class=\"w-3.5 h-3.5 bg-[#47a3ff] border-none rounded-md\"></span>\n                                <span>Selected</span>\n                            </div>\n                        </div>\n                        <div class=\"all-seats justify-center flex flex-wrap gap-x-4 gap-y-2 mt-6 mb-4\">\n                            ");
		jteOutput.writeContent("\n                        </div>\n                    </div>\n                </div>\n                <div class=\"price py-4 flex items-center justify-between\">\n                    <div class=\"total flex flex-col items-start justify-center text-sm font-medium text-gray-700\">\n                        <span><span class=\"count\">0</span> Tickets</span>\n                        <div>Rp. <span class=\"amount\">0</span></div>\n                    </div>\n                    <button type=\"button\" class=\"bg-yellow-400 hover:bg-yellow-500 text-white text-sm py-2 px-6 rounded-md transition duration-300 cursor-pointer\">Book</button>\n                </div>\n            </div>\n            <div class=\"timings flex flex-col items-center w-full md:w-2/4 mt-6 md:mt-0 md:ml-4 drop-shadow-md\">\n                <h3 class=\"text-xl font-semibold text-gray-800 mb-4\">Select Date and Time</h3>\n\n                ");
		jteOutput.writeContent("\n                <div class=\"dates w-full flex flex-wrap justify-center gap-4 mb-6\">\n                    <input type=\"radio\" name=\"date\" id=\"d1\" checked class=\"hidden\">\n                    <label for=\"d1\" class=\"dates-item w-16 h-16 bg-white flex flex-col items-center justify-center p-2 rounded-md cursor-pointer hover:bg-sky-500 hover:text-white transition duration-200\">\n                        <div class=\"day text-xs font-semibold\">Fri</div>\n                        <div class=\"date text-lg font-bold\">12</div>\n                    </label>\n                    <input type=\"radio\" name=\"date\" id=\"d2\" class=\"hidden\">\n                    <label for=\"d2\" class=\"dates-item w-16 h-16 bg-white flex flex-col items-center justify-center p-2 rounded-md cursor-pointer hover:bg-sky-500 hover:text-white transition duration-200\">\n                        <div class=\"day text-xs font-semibold\">Sat</div>\n                        <div class=\"date text-lg font-bold\">13</div>\n                    </label>\n                    <input type=\"radio\" name=\"date\" id=\"d3\" class=\"hidden\">\n                    <label for=\"d3\" class=\"dates-item w-16 h-16 bg-white flex flex-col items-center justify-center p-2 rounded-md cursor-pointer hover:bg-sky-500 hover:text-white transition duration-200\">\n                        <div class=\"day text-xs font-semibold\">Sun</div>\n                        <div class=\"date text-lg font-bold\">14</div>\n                    </label>\n                    <input type=\"radio\" name=\"date\" id=\"d4\" class=\"hidden\">\n                    <label for=\"d4\" class=\"dates-item w-16 h-16 bg-white flex flex-col items-center justify-center p-2 rounded-md cursor-pointer hover:bg-sky-500 hover:text-white transition duration-200\">\n                        <div class=\"day text-xs font-semibold\">Mon</div>\n                        <div class=\"date text-lg font-bold\">15</div>\n                    </label>\n                    <input type=\"radio\" name=\"date\" id=\"d5\" class=\"hidden\">\n                    <label for=\"d5\" class=\"dates-item w-16 h-16 bg-white flex flex-col items-center justify-center p-2 rounded-md cursor-pointer hover:bg-sky-500 hover:text-white transition duration-200\">\n                        <div class=\"day text-xs font-semibold\">Tue</div>\n                        <div class=\"date text-lg font-bold\">16</div>\n                    </label>\n                    <input type=\"radio\" name=\"date\" id=\"d6\" class=\"hidden\">\n                    <label for=\"d6\" class=\"dates-item w-16 h-16 bg-white flex flex-col items-center justify-center p-2 rounded-md cursor-pointer hover:bg-sky-500 hover:text-white transition duration-200\">\n                        <div class=\"day text-xs font-semibold\">Wed</div>\n                        <div class=\"date text-lg font-bold\">17</div>\n                    </label>\n                    <input type=\"radio\" name=\"date\" id=\"d7\" class=\"hidden\">\n                    <label for=\"d7\" class=\"dates-item w-16 h-16 bg-white flex flex-col items-center justify-center p-2 rounded-md cursor-pointer hover:bg-sky-500 hover:text-white transition duration-200\">\n                        <div class=\"day text-xs font-semibold\">Thu</div>\n                        <div class=\"date text-lg font-bold\">18</div>\n                    </label>\n                </div>\n\n                ");
		jteOutput.writeContent("\n                <div class=\"times w-full flex justify-center gap-4 md:gap-6\">\n                    <input type=\"radio\" name=\"time\" id=\"t1\" checked class=\"hidden\">\n                    <label for=\"t1\" class=\"time text-sm w-fit px-4 py-2 bg-white rounded-md cursor-pointer hover:bg-sky-500 hover:text-white transition duration-200\">11:00</label>\n                    <input type=\"radio\" name=\"time\" id=\"t2\" class=\"hidden\">\n                    <label for=\"t2\" class=\"time text-sm w-fit px-4 py-2 bg-white rounded-md cursor-pointer hover:bg-sky-500 hover:text-white transition duration-200\">14:30</label>\n                    <input type=\"radio\" name=\"time\" id=\"t3\" class=\"hidden\">\n                    <label for=\"t3\" class=\"time text-sm w-fit px-4 py-2 bg-white rounded-md cursor-pointer hover:bg-sky-500 hover:text-white transition duration-200\">18:00</label>\n                    <input type=\"radio\" name=\"time\" id=\"t4\" class=\"hidden\">\n                    <label for=\"t4\" class=\"time text-sm w-fit px-4 py-2 bg-white rounded-md cursor-pointer hover:bg-sky-500 hover:text-white transition duration-200\">21:30</label>\n                </div>\n            </div>\n        </div>\n    </div>\n</div>\n");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		render(jteOutput, jteHtmlInterceptor);
	}
}
