/**
 * This file is part of Wikiforia.
 *
 * Wikiforia is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 2 of the License, or
 * (at your option) any later version.
 *
 * Wikiforia is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Wikiforia. If not, see <http://www.gnu.org/licenses/>.
 */
 package se.lth.cs.nlp.wikipedia.lang;

//Autogenerated from Wikimedia sources at 2015-04-16T13:55:11+00:00

public class KsConfig extends TemplateConfig {
	public KsConfig() {
		addNamespaceAlias(-2, "میڈیا");
		addNamespaceAlias(-1, "خاص");
		addNamespaceAlias(0, "");
		addNamespaceAlias(1, "بَحَژ");
		addNamespaceAlias(2, "رُکُن");
		addNamespaceAlias(3, "رُکُن_بَحَژ");
		addNamespaceAlias(5, "Wikipedia_بَحَژ");
		addNamespaceAlias(6, "فَیِل");
		addNamespaceAlias(7, "فَیِل_بَحَژ");
		addNamespaceAlias(8, "میڈیاوکی");
		addNamespaceAlias(9, "میڈیاوکی_بَحَژ");
		addNamespaceAlias(10, "فرما");
		addNamespaceAlias(11, "فرما_بَحَژ");
		addNamespaceAlias(12, "پَلزُن");
		addNamespaceAlias(13, "پَلزُن_بَحَژ");
		addNamespaceAlias(14, "زٲژ");
		addNamespaceAlias(15, "زٲژ_بَحَژ");

	}

	@Override
	protected String getSiteName() {
		return "Wikipedia";
	}

	@Override
	protected String getWikiUrl() {
		return "http://ks.wikipedia.org/";
	}

	@Override
	public String getIso639() {
		return "ks";
	}
}